package com.library;

import java.time.LocalDate;

public class BookLending {
    private LocalDate creationDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String bookItemBarcode;
    private String memberId;

    public BookLending(LocalDate creationDate, LocalDate dueDate, String bookItemBarcode, String memberId) {
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.bookItemBarcode = bookItemBarcode;
        this.memberId = memberId;
        this.returnDate = null;
    }

    public LocalDate getCreationDate() { return creationDate; }
    public LocalDate getDueDate() { return dueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public String getBookItemBarcode() { return bookItemBarcode; }
    public String getMemberId() { return memberId; }

    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
}
