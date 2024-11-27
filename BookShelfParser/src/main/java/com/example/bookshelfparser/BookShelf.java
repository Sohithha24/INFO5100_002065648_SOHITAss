package com.example.bookshelfparser;

import java.util.List;

public class BookShelf {
    private List<Book> books; // List to hold multiple books

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}
