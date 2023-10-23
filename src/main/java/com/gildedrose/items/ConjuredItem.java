package com.gildedrose.items;

import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public final class ConjuredItem extends Item {

    private static final int DAYS_TO_DECREASE_THE_QUALITY = 0;

    public ConjuredItem(Name name, SellIn sellIn, Quality quality) {
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
