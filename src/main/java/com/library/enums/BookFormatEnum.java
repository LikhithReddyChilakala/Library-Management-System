package com.library.enums;

public enum BookFormatEnum {
    HARDCOVER(1),
    PAPERBACK(2),
    AUDIOBOOK(3),
    EBOOK(4),
    NEWSPAPER(5),
    MAGAZINE(6),
    JOURNAL(7);

    private final int value;

    BookFormatEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
