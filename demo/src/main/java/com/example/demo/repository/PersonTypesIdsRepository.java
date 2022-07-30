package com.example.demo.repository;

import com.example.demo.modal.PersonTypesIds;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonTypesIdsRepository extends JpaRepository<PersonTypesIds, Long> {
    List<PersonTypesIds> findAllByPersonId(Long personId);
}
