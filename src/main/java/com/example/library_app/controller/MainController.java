package com.example.library_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.library_app.entity.Author;
import com.example.library_app.entity.Book;
import com.example.library_app.service.AuthorService;
import com.example.library_app.service.BookService;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }

    @GetMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @GetMapping("/author/new")
    public String newAuthorForm(Model model) {
        model.addAttribute("author", new Author());
        return "author_form";
    }

    @GetMapping("/book/new")
    public String newBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "book_form";
    }

    @PostMapping("/author/save")
    public String saveAuthor(Author author) {
        authorService.save(author);
        return "redirect:/authors";
    }

    @PostMapping("/book/save")
    public String saveBook(Book book) {
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/author/{name}/books")
    public String getBooksByAuthor(@PathVariable String name, Model model) {
        model.addAttribute("books", authorService.findBooksByAuthorName(name));
        return "books";
    }

    @GetMapping("/book/{title}/authors")
    public String getAuthorsByBook(@PathVariable String title, Model model) {
        model.addAttribute("authors", bookService.findAuthorsByBookTitle(title));
        return "authors";
    }

    @GetMapping("/author/edit/{id}")
    public String editAuthorForm(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.findById(id).orElse(new Author()));
        return "author_form";
    }

    @GetMapping("/book/edit/{id}")
    public String editBookForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.findById(id).orElse(new Book()));
        return "book_form";
    }

    @PostMapping("/author/update")
    public String updateAuthor(@ModelAttribute Author author) {
        authorService.save(author);
        return "redirect:/authors";
    }

    @PostMapping("/book/update")
    public String updateBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/books";
    }
}