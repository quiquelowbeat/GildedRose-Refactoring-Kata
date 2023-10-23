package com.gildedrose.items;

import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public abstract class Item {

    private final Name name;
    private SellIn sellIn;
    private Quality quality;

    Item(Name name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public SellIn sellIn() {
        return sellIn;
    }

    public Quality quality() {
        return quality;
    }

    public Name name() {
        return name;
    }

    public void increaseQuality() {
        quality = quality.increase();
    }

    public void decreaseQuality() {
        quality = quality.decrease();
    }

    public void resetQuality() {
        quality = quality.reset();
    }

    public void decreaseSellIn() {
        sellIn = sellIn.decrease();
    }

    public boolean isUnderSellInThresholdOf(int days) {
        return sellIn.isUnderThresholdOf(days);
    }

    public abstract void updateQuality();

    @Override
    public String toString() {
        return this.name.value() + ", " + this.sellIn.value() + ", " + this.quality.value();
    }
}
