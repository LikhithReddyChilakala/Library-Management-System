package com.library;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements Search {
    private List<Book> booksByTitle;
    private List<Book> booksByAuthor;
    private List<Book> booksBySubject;
    private List<Book> booksByPublicationDate;

    public Catalog() {
        this.booksByTitle = new ArrayList<>();
        this.booksByAuthor = new ArrayList<>();
        this.booksBySubject = new ArrayList<>();
        this.booksByPublicationDate = new ArrayList<>();
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return booksByTitle.stream().filter(b -> b.getTitle().contains(title)).toList();
    }

    @Override
    public List<Book> searchByAuthor(String authorName) {
        return booksByAuthor.stream().filter(b -> b.getAuthors().stream().anyMatch(a -> a.getName().contains(authorName))).toList();
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        return booksBySubject.stream().filter(b -> b.getSubject().contains(subject)).toList();
    }

    @Override
    public List<Book> searchByPublicationDate(String date) {
        return booksByPublicationDate;
    }
}
