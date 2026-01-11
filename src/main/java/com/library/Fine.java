package com.library;

import java.time.LocalDate;

public class Fine {
    private LocalDate creationDate;
    private String bookItemBarcode;
    private String memberId;
    private double fineAmount;

    public Fine(LocalDate creationDate, String bookItemBarcode, String memberId) {
        this.creationDate = creationDate;
        this.bookItemBarcode = bookItemBarcode;
        this.memberId = memberId;
        this.fineAmount = 0.0;
    }

    public LocalDate getCreationDate() { return creationDate; }
    public String getBookItemBarcode() { return bookItemBarcode; }
    public String getMemberId() { return memberId; }
    public double getFineAmount() { return fineAmount; }

    public void collectFine(int numberOfDaysOverdue) {
        this.fineAmount = numberOfDaysOverdue * 1.5;
    }
}
