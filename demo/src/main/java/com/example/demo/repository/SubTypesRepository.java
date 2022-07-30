package com.example.demo.repository;

import com.example.demo.modal.SubTypes;
import com.example.demo.modal.Types;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubTypesRepository extends JpaRepository<SubTypes, Long> {
    List<SubTypes> findAllByTypes(Types types);
}
