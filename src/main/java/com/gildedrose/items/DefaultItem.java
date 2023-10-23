package com.gildedrose.items;

public final class DefaultItem extends Item {

    private static final int DAYS_TO_DECREASE_THE_QUALITY = 0;

    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        decreaseQuality();
        if (isUnderSellInThresholdOf(DAYS_TO_DECREASE_THE_QUALITY)) {
            decreaseQuality();
        }
    }
}
