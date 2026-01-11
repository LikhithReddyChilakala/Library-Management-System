package com.library;

import com.library.enums.AccountStatusEnum;

public abstract class Account {
    private String id;
    private String password;
    private Person person;
    private AccountStatusEnum status;

    public Account(String id, String password, Person person, AccountStatusEnum status) {
        this.id = id;
        this.password = password;
        this.person = person;
        this.status = status;
    }

    public String getId() { return id; }
    public String getPassword() { return password; }
    public Person getPerson() { return person; }
    public AccountStatusEnum getStatus() { return status; }

    public void setPassword(String password) { this.password = password; }
    public void setStatus(AccountStatusEnum status) { this.status = status; }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }
}
