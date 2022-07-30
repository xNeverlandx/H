package com.example.demo.dto.mapper;

import com.example.demo.dto.SubTypesDto;
import com.example.demo.dto.TypesDto;
import com.example.demo.modal.Types;
import com.example.demo.repository.SubTypesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TypesDtoMapper {
    private final SubTypesRepository subTypesRepository;
    private final SubTypesDtoMapper subTypesDtoMapper;

    public TypesDto typesToTypesDto(Types types) {
        List<SubTypesDto> subTypesDtos = subTypesRepository.findAllByTypes(types)
                .stream()
                .map(subTypesDtoMapper::subTypesToSubTypesDto)
                .collect(Collectors.toList());

        return TypesDto.builder()
                .id(types.getId())
                .name(types.getName())
                .listOfSubTypes(subTypesDtos)
                .build();
    }
}
