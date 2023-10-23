package com.gildedrose.items;

public class AgedBrie extends Item {

    private static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(String name, int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();
        if (getSellIn() < 0) {
            increaseQuality();
        }
    }
}
