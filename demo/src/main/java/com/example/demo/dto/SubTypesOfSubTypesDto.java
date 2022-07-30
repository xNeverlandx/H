package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubTypesOfSubTypesDto {

    private Long id;
    private String name;
    private List<SubSubSubTypesDto> subSubSubTypesDtos;
}
