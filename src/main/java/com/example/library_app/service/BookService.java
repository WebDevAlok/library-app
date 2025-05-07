package com.example.library_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_app.entity.Book;
import com.example.library_app.entity.Author;
import com.example.library_app.repository.BookRepository;
import com.example.library_app.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public Book save(Book book) {
        Set<Author> authors = book.getAuthors();
        if (authors != null) {
            authors.forEach(author -> {
                if (author.getId() == null) {
                    authorRepository.save(author);
                }
            });
        }
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Author> findAuthorsByBookTitle(String title) {
        return bookRepository.findAuthorsByTitle(title);
    }
}