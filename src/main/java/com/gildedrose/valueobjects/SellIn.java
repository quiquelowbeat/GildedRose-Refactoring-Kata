package com.gildedrose.valueobjects;

public class SellIn {

    private final int value;

    public SellIn(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public SellIn decrease() {
        return new SellIn(value - 1);
    }

    public boolean isUnderThresholdOf(int days) {
        return value <= days;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
