package com.example.demo.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sub_sub_subtypes")
public class SubSubSubTypes {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private SubTypesOfSubTypes subTypesOfSubTypes;
}
