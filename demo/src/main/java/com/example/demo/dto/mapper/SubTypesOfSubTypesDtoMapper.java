package com.example.demo.dto.mapper;

import com.example.demo.dto.SubSubSubTypesDto;
import com.example.demo.dto.SubTypesDto;
import com.example.demo.dto.SubTypesOfSubTypesDto;
import com.example.demo.modal.SubTypesOfSubTypes;
import com.example.demo.repository.SubSubSubTypesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SubTypesOfSubTypesDtoMapper {
    private final SubSubSubTypesDtoMapper subSubSubTypesDtoMapper;
    private final SubSubSubTypesRepository subSubSubTypesRepository;

    public SubTypesOfSubTypesDto subTypesOfSubTypesToDto(SubTypesOfSubTypes subTypesOfSubTypes) {
        List<SubSubSubTypesDto> subSubSubTypesDtos = subSubSubTypesRepository.findAllBySubTypesOfSubTypes(subTypesOfSubTypes)
                .stream()
                .map(subSubSubTypesDtoMapper::subSubSubTypesToDto)
                .collect(Collectors.toList());

        return SubTypesOfSubTypesDto.builder()
                .id(subTypesOfSubTypes.getId())
                .name(subTypesOfSubTypes.getName())
                .subSubSubTypesDtos(subSubSubTypesDtos)
                .build();
    }
}
