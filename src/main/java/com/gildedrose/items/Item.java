package com.gildedrose.items;

import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public abstract class Item {

    private final Name name;
    private SellIn sellIn;
    private Quality quality;

    Item(String name, int sellIn, int quality) {
        this.name = new Name(name);
        this.sellIn = new SellIn(sellIn);
        this.quality = new Quality(quality);
    }

    public SellIn sellIn() {
        return sellIn;
    }

    public Quality quality() {
        return quality;
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
