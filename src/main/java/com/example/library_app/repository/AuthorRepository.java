package com.example.library_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.example.library_app.entity.Author;
import com.example.library_app.entity.Book;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Book> findBooksByName(String name);
}