package com.gildedrose.exceptions;

public class InvalidQualityValue extends IllegalArgumentException {
    public InvalidQualityValue(int quality) {
        super("Invalid quality value: " + quality + ". Allowed range: from 0 to 50.");
    }
}
