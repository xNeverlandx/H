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
@Table(name = "subtypes")
public class SubTypes {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Types types;
}
