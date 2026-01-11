package com.library;

import com.library.enums.AccountStatusEnum;

public class Librarian extends Account {
    public Librarian(String id, String password, Person person, AccountStatusEnum status) {
        super(id, password, person, status);
    }

    public boolean addBookItem(BookItem bookItem) {
        if (bookItem != null) {
            System.out.println("Book item added successfully");
            return true;
        }
        return false;
    }

    public boolean removeBookItem(BookItem bookItem) {
        if (bookItem != null) {
            System.out.println("Book item removed successfully");
            return true;
        }
        return false;
    }

    public void blockMember(Member member) {
        if (member != null) {
            member.setStatus(AccountStatusEnum.BLACKLISTED);
            System.out.println("Member blocked");
        }
    }

    public void unblockMember(Member member) {
        if (member != null) {
            member.setStatus(AccountStatusEnum.ACTIVE);
            System.out.println("Member unblocked");
        }
    }
}
