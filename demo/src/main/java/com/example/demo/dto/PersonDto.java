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
public class PersonDto {

    private Long id;
    private String name;
    private boolean agreeToTerms;
    private List<Long> typesIds;
}
