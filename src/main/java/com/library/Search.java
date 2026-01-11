package com.library;

import java.util.List;

public interface Search {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String authorName);
    List<Book> searchBySubject(String subject);
    List<Book> searchByPublicationDate(String date);
}
