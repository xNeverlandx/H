package com.example.demo.dto.mapper;

import com.example.demo.dto.SubSubSubTypesDto;
import com.example.demo.dto.SubTypesOfSubTypesDto;
import com.example.demo.modal.SubSubSubTypes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SubSubSubTypesDtoMapper {
    public SubSubSubTypesDto subSubSubTypesToDto(SubSubSubTypes subSubSubTypes) {
        return SubSubSubTypesDto.builder()
                .id(subSubSubTypes.getId())
                .name(subSubSubTypes.getName())
                .build();
    }
}
