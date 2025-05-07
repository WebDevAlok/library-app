INSERT INTO author (id, name, biography) VALUES
(1, 'J.K. Rowling', 'British author, best known for the Harry Potter series.'),
(2, 'George R.R. Martin', 'American novelist and short story writer, author of A Song of Ice and Fire.'),
(3, 'J.R.R. Tolkien', 'English writer, poet, and philologist, author of The Lord of the Rings.'),
(4, 'Agatha Christie', 'English writer known for her 66 detective novels.'),
(5, 'Stephen King', 'American author of horror, supernatural fiction, suspense, and fantasy novels.'),
(6, 'Isaac Asimov', 'American author and professor of biochemistry, known for his works of science fiction.'),
(7, 'Arthur Conan Doyle', 'British writer, creator of Sherlock Holmes.'),
(8, 'Jane Austen', 'English novelist known for her six major novels.'),
(9, 'Mark Twain', 'American writer, humorist, and lecturer, author of Adventures of Huckleberry Finn.'),
(10, 'Ernest Hemingway', 'American novelist and short story writer, known for his economical and understated style.');

INSERT INTO book (id, title, description, isbn, publication_year, publisher) VALUES
(1, 'Harry Potter and the Philosopher''s Stone', 'The first book in the Harry Potter series.', '9780747532699', 1997, 'Bloomsbury'),
(2, 'A Game of Thrones', 'The first book in A Song of Ice and Fire series.', '9780553103540', 1996, 'Bantam Spectra'),
(3, 'The Fellowship of the Ring', 'The first volume of The Lord of the Rings.', '9780261103573', 1954, 'George Allen & Unwin'),
(4, 'Murder on the Orient Express', 'A Hercule Poirot mystery novel.', '9780007119318', 1934, 'Collins Crime Club'),
(5, 'The Shining', 'A horror novel set in the Overlook Hotel.', '9780385121675', 1977, 'Doubleday'),
(6, 'Foundation', 'The first book in the Foundation series.', '9780553293357', 1951, 'Gnome Press'),
(7, 'The Hound of the Baskervilles', 'A Sherlock Holmes mystery novel.', '9780747532698', 1902, 'George Newnes'),
(8, 'Pride and Prejudice', 'A romantic novel of manners.', '9780679783268', 1813, 'T. Egerton'),
(9, 'Adventures of Huckleberry Finn', 'A novel about the adventures of a boy and a runaway slave.', '9780486280615', 1884, 'Chatto & Windus'),
(10, 'The Old Man and the Sea', 'A short novel about an aging fisherman.', '9780684830490', 1952, 'Charles Scribner''s Sons');

INSERT INTO author_book (author_id, book_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);