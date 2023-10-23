package com.gildedrose.items;

public abstract class Item {

    private final String name;
    private int sellIn;
    private int quality;

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void increaseQuality() {
        if (quality < MAX_QUALITY) {
            quality += 1;
        }
    }

    public void decreaseQuality() {
        if (quality > MIN_QUALITY) {
            quality -= 1;
        }
    }

    public void resetQuality() {
        quality = MIN_QUALITY;
    }

    public void decreaseSellIn() {
        sellIn -= 1;
    }

    public int getSellIn(){
        return sellIn;
    }

    public abstract void updateQuality();

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
