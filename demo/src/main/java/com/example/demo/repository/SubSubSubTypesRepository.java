package com.example.demo.repository;

import com.example.demo.modal.SubSubSubTypes;
import com.example.demo.modal.SubTypesOfSubTypes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubSubSubTypesRepository extends JpaRepository<SubSubSubTypes, Long> {
    List<SubSubSubTypes> findAllBySubTypesOfSubTypes(SubTypesOfSubTypes subTypesOfSubTypes);
}
