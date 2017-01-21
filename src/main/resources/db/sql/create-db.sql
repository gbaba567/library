--DROP TABLE users IF EXISTS;

CREATE TABLE users (
    userId          INTEGER auto_increment PRIMARY KEY,
    name        VARCHAR(30),
    phone       VARCHAR(15),
    email       VARCHAR(50)
);


CREATE TABLE books (
    bookId          INTEGER auto_increment PRIMARY KEY,
    title       VARCHAR(100),
    author      VARCHAR(50),
    isbn        VARCHAR(50)
);


CREATE TABLE users_books(
    id INTEGER auto_increment PRIMARY KEY,
    userId INTEGER REFERENCES users,
    bookId INTEGER REFERENCES books,
    learningDate DATE
);