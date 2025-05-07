package com.example.library_app;

import com.example.library_app.entity.Author;
import com.example.library_app.entity.Book;
import com.example.library_app.service.AuthorService;
import com.example.library_app.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatabasePopulationTest {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @Test
    public void populateDatabase() {
        // Create authors
        Author author1 = new Author("J.K. Rowling", "British author, best known for the Harry Potter series.");
        Author author2 = new Author("George R.R. Martin", "American novelist, author of A Song of Ice and Fire.");
        Author author3 = new Author("Jane Austen", "English novelist known for her six major novels.");
        Author author4 = new Author("Isaac Asimov", "American author, known for his works of science fiction.");
        Author author5 = new Author("Agatha Christie", "English writer known for her detective novels.");
        Author author6 = new Author("Mark Twain", "American writer, humorist, and lecturer.");
        Author author7 = new Author("J.R.R. Tolkien", "English writer, author of The Lord of the Rings.");
        Author author8 = new Author("Stephen King", "American author of horror and supernatural fiction.");
        Author author9 = new Author("Arthur Conan Doyle", "British writer, creator of Sherlock Holmes.");
        Author author10 = new Author("Ernest Hemingway", "American novelist and short story writer.");

        // Save authors
        author1 = authorService.save(author1);
        author2 = authorService.save(author2);
        author3 = authorService.save(author3);
        author4 = authorService.save(author4);
        author5 = authorService.save(author5);
        author6 = authorService.save(author6);
        author7 = authorService.save(author7);
        author8 = authorService.save(author8);
        author9 = authorService.save(author9);
        author10 = authorService.save(author10);

        // Create books
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "Fantasy novel.", "9780747532691", 1997, "Bloomsbury");
        Book book2 = new Book("A Game of Thrones", "Fantasy novel.", "9780553103541", 1996, "Bantam Spectra");
        Book book3 = new Book("Pride and Prejudice", "Romantic novel.", "9780679783269", 1813, "T. Egerton");
        Book book4 = new Book("Foundation", "Science fiction novel.", "9780553293358", 1951, "Gnome Press");
        Book book5 = new Book("Murder on the Orient Express", "Detective novel.", "9780007119319", 1934, "Collins Crime Club");
        Book book6 = new Book("Adventures of Huckleberry Finn", "Adventure novel.", "9780486280616", 1884, "Chatto & Windus");
        Book book7 = new Book("The Fellowship of the Ring", "Fantasy novel.", "9780261103574", 1954, "George Allen & Unwin");
        Book book8 = new Book("The Shining", "Horror novel.", "9780385121676", 1977, "Doubleday");
        Book book9 = new Book("The Hound of the Baskervilles", "Detective novel.", "9780747532698", 1902, "George Newnes");
        Book book10 = new Book("The Old Man and the Sea", "Short novel.", "9780684830491", 1952, "Charles Scribner's Sons");

        // Save books
        book1 = bookService.save(book1);
        book2 = bookService.save(book2);
        book3 = bookService.save(book3);
        book4 = bookService.save(book4);
        book5 = bookService.save(book5);
        book6 = bookService.save(book6);
        book7 = bookService.save(book7);
        book8 = bookService.save(book8);
        book9 = bookService.save(book9);
        book10 = bookService.save(book10);

        // Establish relationships
        author1.getBooks().add(book1);
        author2.getBooks().add(book2);
        author3.getBooks().add(book3);
        author4.getBooks().add(book4);
        author5.getBooks().add(book5);
        author6.getBooks().add(book6);
        author7.getBooks().add(book7);
        author8.getBooks().add(book8);
        author9.getBooks().add(book9);
        author10.getBooks().add(book10);

        author1.getBooks().add(book2);
        author2.getBooks().add(book3);
        author3.getBooks().add(book4);
        author4.getBooks().add(book5);
        author5.getBooks().add(book6);

        // Save relationships
        authorService.save(author1);
        authorService.save(author2);
        authorService.save(author3);
        authorService.save(author4);
        authorService.save(author5);
        authorService.save(author6);
        authorService.save(author7);
        authorService.save(author8);
        authorService.save(author9);
        authorService.save(author10);
    }
}