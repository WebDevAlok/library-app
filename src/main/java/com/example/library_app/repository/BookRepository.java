package com.example.library_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library_app.entity.Book;
import com.example.library_app.entity.Author;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Author> findAuthorsByTitle(String title);
}