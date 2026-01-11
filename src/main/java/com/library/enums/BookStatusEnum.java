package com.library.enums;

public enum BookStatusEnum {
    AVAILABLE(1),
    RESERVED(2),
    LOANED(3),
    LOST(4);

    private final int value;

    BookStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
