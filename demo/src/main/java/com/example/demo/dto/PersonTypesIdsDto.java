package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonTypesIdsDto {

    private Long id;
    private PersonDto user;
    private Long typeId;
    private Date dateDeleted;

}
