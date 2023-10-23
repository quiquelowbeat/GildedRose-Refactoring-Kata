package com.gildedrose.items;

public final class ConjuredItem extends Item {

    private static final int DAYS_TO_DECREASE_THE_QUALITY = 0;

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        decreaseQuality();
        decreaseQuality();
        if (isUnderSellInThresholdOf(DAYS_TO_DECREASE_THE_QUALITY)) {
            decreaseQuality();
            decreaseQuality();
        }
    }
}
