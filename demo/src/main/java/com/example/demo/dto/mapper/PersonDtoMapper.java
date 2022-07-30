package com.example.demo.dto.mapper;

import com.example.demo.dto.PersonDto;
import com.example.demo.modal.Person;
import com.example.demo.modal.PersonTypesIds;
import com.example.demo.repository.PersonTypesIdsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PersonDtoMapper {
    private final PersonTypesIdsRepository personTypesIdsRepository;

    public PersonDto personToPersonDto(Person person) {
        List<Long> personTypesIds = personTypesIdsRepository.findAllByPersonId(person.getId())
                .stream()
                .map(PersonTypesIds::getTypeId).collect(Collectors.toList());


        return PersonDto.builder()
                .id(person.getId())
                .name(person.getName())
                .agreeToTerms(person.isAgreeToTerms())
                .typesIds(personTypesIds)
                .build();
    }

    public Person personDtoToPerson(PersonDto personDto) {
        Person person = new Person();
        person.setName(personDto.getName());
        person.setAgreeToTerms(personDto.isAgreeToTerms());
        return person;
    }
}
