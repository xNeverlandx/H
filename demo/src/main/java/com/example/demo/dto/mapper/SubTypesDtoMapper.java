package com.example.demo.dto.mapper;

import com.example.demo.dto.SubTypesDto;
import com.example.demo.dto.SubTypesOfSubTypesDto;
import com.example.demo.dto.TypesDto;
import com.example.demo.modal.SubTypes;
import com.example.demo.repository.SubTypesOfSubTypesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SubTypesDtoMapper {
    private final SubTypesOfSubTypesRepository subTypesOfSubTypesRepository;
    private final SubTypesOfSubTypesDtoMapper subTypesOfSubTypesDtoMapper;

    public SubTypesDto subTypesToSubTypesDto(SubTypes subTypes) {
        List<SubTypesOfSubTypesDto> subTypesOfSubTypesDtos = subTypesOfSubTypesRepository.findAllBySubTypes(subTypes)
                .stream()
                .map(subTypesOfSubTypesDtoMapper::subTypesOfSubTypesToDto)
                .collect(Collectors.toList());

        return SubTypesDto.builder()
                .id(subTypes.getId())
                .name(subTypes.getName())
                .subTypesOfSubTypesDtos(subTypesOfSubTypesDtos)
                .build();
    }
}
