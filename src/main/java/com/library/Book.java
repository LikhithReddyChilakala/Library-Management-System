package com.library;

import com.library.enums.BookStatusEnum;
import java.util.ArrayList;
import java.util.List;

public abstract class Book {
    private String isbn;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;
    private List<Author> authors;

    public Book(String isbn, String title, String subject, String publisher, String language, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.numberOfPages = numberOfPages;
        this.authors = new ArrayList<>();
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getSubject() { return subject; }
    public String getPublisher() { return publisher; }
    public String getLanguage() { return language; }
    public int getNumberOfPages() { return numberOfPages; }
    public List<Author> getAuthors() { return authors; }

    public void addAuthor(Author author) { authors.add(author); }
    public void setTitle(String title) { this.title = title; }
    public void setSubject(String subject) { this.subject = subject; }
}
