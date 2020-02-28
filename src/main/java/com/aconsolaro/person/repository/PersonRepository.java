package com.aconsolaro.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aconsolaro.person.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
