package com.library;

import com.library.enums.AccountStatusEnum;
import java.time.LocalDate;

public class Member extends Account {
    private LocalDate dateOfMembership;
    private int totalBooksCheckedOut;

    public Member(String id, String password, Person person, AccountStatusEnum status) {
        super(id, password, person, status);
        this.dateOfMembership = LocalDate.now();
        this.totalBooksCheckedOut = 0;
    }

    public LocalDate getDateOfMembership() { return dateOfMembership; }
    public int getTotalBooksCheckedOut() { return totalBooksCheckedOut; }

    public void incrementTotalBooksCheckedOut() { this.totalBooksCheckedOut++; }
    public void decrementTotalBooksCheckedOut() { if (this.totalBooksCheckedOut > 0) this.totalBooksCheckedOut--; }

    public boolean checkoutBookItem(BookItem bookItem) {
        if (totalBooksCheckedOut >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("User has reached max checkout limit");
            return false;
        }
        if (bookItem.checkout(this.getId())) {
            incrementTotalBooksCheckedOut();
            return true;
        }
        return false;
    }

    public void returnBookItem(BookItem bookItem) {
        bookItem.returnBook();
        decrementTotalBooksCheckedOut();
    }
}
