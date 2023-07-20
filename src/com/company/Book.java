package com.company;

public class Book {
    String nameBook;
    String bookAuthor;
    int year;
    String bookGenre;

    public Book(String nameBook, String bookAuthor, int year, String bookGenre) {
        this.nameBook = nameBook;
        this.bookAuthor = bookAuthor;
        this.year = year;
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", year=" + year +
                ", bookGenre='" + bookGenre + '\'' +
                '}';
    }
}
