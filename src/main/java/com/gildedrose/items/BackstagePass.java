package com.gildedrose.items;

public final class BackstagePass extends Item {

    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePass(String name, int sellIn, int quality) {
        super(BACKSTAGE_PASSES, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();
        if (getSellIn() <= 10) {
            increaseQuality();
        }
        if (getSellIn() <= 5) {
            increaseQuality();
        }
        if (getSellIn() < 0) {
            resetQuality();
        }
    }

}

