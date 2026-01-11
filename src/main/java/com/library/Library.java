package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private Address address;
    private List<BookItem> bookItems;
    private List<Member> members;
    private Catalog catalog;

    public Library(String name, Address address) {
        this.name = name;
        this.address = address;
        this.bookItems = new ArrayList<>();
        this.members = new ArrayList<>();
        this.catalog = new Catalog();
    }

    public String getName() { return name; }
    public Address getAddress() { return address; }
    public List<BookItem> getBookItems() { return bookItems; }
    public List<Member> getMembers() { return members; }
    public Catalog getCatalog() { return catalog; }

    public void addBook(BookItem bookItem) { bookItems.add(bookItem); }
    public void addMember(Member member) { members.add(member); }
}
