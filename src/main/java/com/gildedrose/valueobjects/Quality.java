package com.gildedrose.valueobjects;

import com.gildedrose.exceptions.InvalidQualityValue;

public class Quality {

    private final int value;
    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    public Quality(int value) {
        checkQualityRange(value);
        this.value = value;
    }

    protected void checkQualityRange(int value) {
        if(value < MIN_QUALITY || value > MAX_QUALITY) {
            throw new InvalidQualityValue(value);
        }
    }

    public int value() {
        return value;
    }

    public Quality increase() {
        if (value == MAX_QUALITY) {
            return this;
        }
        return new Quality(value + 1);

    }

    public Quality decrease() {
        if (value == MIN_QUALITY) {
            return this;
        }
        return new Quality(value - 1);
    }

    public Quality reset() {
        return new Quality(MIN_QUALITY);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
