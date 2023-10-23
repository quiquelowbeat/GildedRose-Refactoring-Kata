package com.gildedrose.items;

import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public final class BackstagePass extends Item {

    private static final int DAYS_FOR_DOUBLE_THE_QUALITY = 10;
    private static final int DAYS_FOR_TRIPLE_THE_QUALITY = 5;
    private static final int QUALITY_RESET_PERIOD = 0;


    public BackstagePass(Name name, SellIn sellIn, Quality quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();
        increaseQuality();
        if (isUnderSellInThresholdOf(DAYS_FOR_DOUBLE_THE_QUALITY)) {
            increaseQuality();
        }
        if (isUnderSellInThresholdOf(DAYS_FOR_TRIPLE_THE_QUALITY)) {
            increaseQuality();
        }
        if (isUnderSellInThresholdOf(QUALITY_RESET_PERIOD)) {
            resetQuality();
        }
    }

}
