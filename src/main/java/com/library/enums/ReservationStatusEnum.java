package com.library.enums;

public enum ReservationStatusEnum {
    WAITING(1),
    PENDING(2),
    CANCELED(3),
    NONE(4);

    private final int value;

    ReservationStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
