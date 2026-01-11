package com.library;

import com.library.enums.ReservationStatusEnum;
import java.time.LocalDate;

public class BookReservation {
    private LocalDate creationDate;
    private ReservationStatusEnum status;
    private String bookItemBarcode;
    private String memberId;

    public BookReservation(LocalDate creationDate, ReservationStatusEnum status, String bookItemBarcode, String memberId) {
        this.creationDate = creationDate;
        this.status = status;
        this.bookItemBarcode = bookItemBarcode;
        this.memberId = memberId;
    }

    public LocalDate getCreationDate() { return creationDate; }
    public ReservationStatusEnum getStatus() { return status; }
    public String getBookItemBarcode() { return bookItemBarcode; }
    public String getMemberId() { return memberId; }

    public void updateStatus(ReservationStatusEnum status) { this.status = status; }
}
