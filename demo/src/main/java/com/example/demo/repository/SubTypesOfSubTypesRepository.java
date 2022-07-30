package com.example.demo.repository;

import com.example.demo.modal.SubTypes;
import com.example.demo.modal.SubTypesOfSubTypes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubTypesOfSubTypesRepository extends JpaRepository<SubTypesOfSubTypes, Long> {
    List<SubTypesOfSubTypes> findAllBySubTypes(SubTypes subTypes);
}
