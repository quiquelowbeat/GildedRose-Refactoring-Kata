package com.gildedrose.items;

public final class DefaultItem extends Item {

    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        decreaseQuality();
        if (getSellIn() < 0) {
            decreaseQuality();
        }
    }
}
