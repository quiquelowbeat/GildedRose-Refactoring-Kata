package com.gildedrose.items;

public class AgedBrie extends Item{

    private static final int DAYS_TO_DOUBLE_THE_QUALITY = 0;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();
        if (isUnderSellInThresholdOf(DAYS_TO_DOUBLE_THE_QUALITY)) {
            increaseQuality();
        }
    }
}
