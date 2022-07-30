package com.example.demo.dto.mapper;

import com.example.demo.dto.PersonTypesIdsDto;
import com.example.demo.modal.PersonTypesIds;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonTypesIdsDtoMapper {
    private final PersonDtoMapper personDtoMapper;

    public PersonTypesIdsDto typesToTypesDto(PersonTypesIds userPersonTypesIds) {
        return PersonTypesIdsDto.builder()
                .id(userPersonTypesIds.getId())
                .dateDeleted(userPersonTypesIds.getDateDeleted())
                .user(personDtoMapper.personToPersonDto(userPersonTypesIds.getPerson()))
                .typeId(userPersonTypesIds.getTypeId())
                .build();
    }

    public PersonTypesIds typesDtoToTypes(PersonTypesIdsDto userPersonTypesIdsDto) {
        PersonTypesIds userPersonTypesIds = new PersonTypesIds();
        userPersonTypesIds.setTypeId(userPersonTypesIds.getTypeId());
        userPersonTypesIds.setDateDeleted(userPersonTypesIds.getDateDeleted());
        userPersonTypesIds.setPerson(personDtoMapper.personDtoToPerson(userPersonTypesIdsDto.getUser()));
        return userPersonTypesIds;
    }
}
