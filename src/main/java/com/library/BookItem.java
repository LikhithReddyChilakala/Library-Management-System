package com.library;

import com.library.enums.BookStatusEnum;
import java.time.LocalDate;

public class BookItem extends Book {
    private String barcode;
    private boolean isReferenceOnly;
    private boolean borrowed;
    private LocalDate dueDate;
    private double price;
    private String bookFormat;
    private BookStatusEnum status;
    private LocalDate dateOfPurchase;
    private Rack placedAt;

    public BookItem(String isbn, String title, String subject, String publisher, String language, int numberOfPages,
                    String barcode, boolean isReferenceOnly, double price, String bookFormat, LocalDate dateOfPurchase) {
        super(isbn, title, subject, publisher, language, numberOfPages);
        this.barcode = barcode;
        this.isReferenceOnly = isReferenceOnly;
        this.borrowed = false;
        this.price = price;
        this.bookFormat = bookFormat;
        this.status = BookStatusEnum.AVAILABLE;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getBarcode() { return barcode; }
    public boolean isReferenceOnly() { return isReferenceOnly; }
    public boolean isBorrowed() { return borrowed; }
    public LocalDate getDueDate() { return dueDate; }
    public double getPrice() { return price; }
    public String getBookFormat() { return bookFormat; }
    public BookStatusEnum getStatus() { return status; }
    public LocalDate getDateOfPurchase() { return dateOfPurchase; }
    public Rack getPlacedAt() { return placedAt; }

    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public void setStatus(BookStatusEnum status) { this.status = status; }
    public void setPlacedAt(Rack placedAt) { this.placedAt = placedAt; }
    public void setBorrowed(boolean borrowed) { this.borrowed = borrowed; }

    public boolean checkout(String memberId) {
        if (isReferenceOnly) {
            System.out.println("Reference only books cannot be issued");
            return false;
        }
        if (borrowed) {
            System.out.println("Book is already borrowed");
            return false;
        }
        this.borrowed = true;
        this.status = BookStatusEnum.LOANED;
        return true;
    }

    public void returnBook() {
        this.borrowed = false;
        this.dueDate = null;
        this.status = BookStatusEnum.AVAILABLE;
    }
}
