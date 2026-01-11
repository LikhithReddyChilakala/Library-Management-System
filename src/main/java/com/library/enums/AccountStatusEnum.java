package com.library.enums;

public enum AccountStatusEnum {
    ACTIVE(1),
    CLOSED(2),
    CANCELED(3),
    BLACKLISTED(4),
    NONE(5);

    private final int value;

    AccountStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
