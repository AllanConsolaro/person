package com.aconsolaro.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aconsolaro.person.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
