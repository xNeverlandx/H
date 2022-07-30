package com.example.demo.service;

import com.example.demo.dto.TypesDto;
import com.example.demo.dto.PersonDto;
import com.example.demo.dto.mapper.TypesDtoMapper;
import com.example.demo.dto.mapper.PersonDtoMapper;
import com.example.demo.modal.Person;
import com.example.demo.modal.PersonTypesIds;
import com.example.demo.repository.PersonTypesIdsRepository;
import com.example.demo.repository.TypesRepository;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DemoService {
    private final TypesRepository typesRepository;
    private final TypesDtoMapper typesDtoMapper;
    private final PersonDtoMapper personDtoMapper;
    private final PersonRepository personRepository;
    private final PersonTypesIdsRepository personTypesIdsRepository;

    public List<TypesDto> getAllTypes() {
        return typesRepository.findAll()
                .stream()
                .map(typesDtoMapper::typesToTypesDto)
                .collect(Collectors.toList());
    }

    public PersonDto createUser(PersonDto personDto) {
        Person person = personDtoMapper.personDtoToPerson(personDto);
        Person savedPerson = personRepository.save(person);
        personDto.getTypesIds().forEach(i -> {
            PersonTypesIds personTypesIds = new PersonTypesIds();
            personTypesIds.setTypeId(i);
            personTypesIds.setPerson(savedPerson);
            personTypesIdsRepository.save(personTypesIds);
        });
        return personDtoMapper.personToPersonDto(savedPerson);
    }

    public PersonDto getUserById(Long id) {
        Person person = personRepository.getById(id);
        return personDtoMapper.personToPersonDto(person);
    }

    public PersonDto updateUser(PersonDto personDto) {
        if (personDto.getId() == null) {
            return null;
        }
        Person person = personRepository.getById(personDto.getId());
        person.setName(personDto.getName());
        person.setAgreeToTerms(personDto.isAgreeToTerms());
        Person savedPerson = personRepository.save(person);

        List<Long> existTypes = personTypesIdsRepository.findAllByPersonId(person.getId())
                .stream()
                .map(PersonTypesIds::getTypeId).collect(Collectors.toList());

        if (!existTypes.equals(personDto.getTypesIds())) {
            List<PersonTypesIds> existPersonTypes = personTypesIdsRepository.findAllByPersonId(personDto.getId());
            personTypesIdsRepository.deleteAll(existPersonTypes);

            personDto.getTypesIds().forEach(t -> {
                PersonTypesIds personTypesIds = new PersonTypesIds();
                personTypesIds.setTypeId(t);
                personTypesIds.setPerson(savedPerson);
                personTypesIdsRepository.save(personTypesIds);
            });
        }

        return personDto;
    }
}
