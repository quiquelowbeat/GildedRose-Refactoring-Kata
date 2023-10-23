package com.gildedrose.items;

import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public class AgedBrie extends Item{

    private static final int DAYS_TO_DOUBLE_THE_QUALITY = 0;

    public AgedBrie(Name name, SellIn sellIn, Quality quality) {
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
