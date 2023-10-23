package com.gildedrose.items;

public final class Sulfuras extends Item{

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final int SULFURAS_SELLIN_VALUE = 0;
    private static final int SULFURAS_STANDARD_QUALITY = 80;


    public Sulfuras(String name, int sellIn, int quality) {
        super(SULFURAS, SULFURAS_SELLIN_VALUE, SULFURAS_STANDARD_QUALITY);
    }

    @Override
    public void updateQuality() {
    }
}

