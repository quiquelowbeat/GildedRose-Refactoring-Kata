package com.gildedrose.items;

public final class Sulfuras extends Item {

    private static final int SULFURAS_STANDARD_QUALITY = 80;


    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        resetQuality();
    }

    @Override
    public void updateQuality() {
        // Sulfuras quality not affected
    }
}

