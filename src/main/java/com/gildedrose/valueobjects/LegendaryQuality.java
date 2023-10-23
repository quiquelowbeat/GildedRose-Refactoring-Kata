package com.gildedrose.valueobjects;

public class LegendaryQuality extends Quality{

    private static final int SULFURAS_STANDARD_QUALITY = 80;

    public LegendaryQuality() {
        super(SULFURAS_STANDARD_QUALITY);
    }

    @Override
    protected void checkQualityRange(int value) {
        // Not need to check quality of Sulfuras quality
    }
}
