package com.gildedrose;

class GildedRose {
    Item[] items;

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case AGED_BRIE:
                    decreaseSellIn(item);
                    updateAgedBrieQuality(item);
                    break;
                case BACKSTAGE_PASSES:
                    decreaseSellIn(item);
                    updateBackstagePassesQuality(item);
                    break;
                case SULFURAS:
                    break;
                default:
                    decreaseSellIn(item);
                    updateDefaultItemQuality(item);
            }
        }
    }

    private void updateBackstagePassesQuality(Item item) {
        increaseQuality(item);
        if (item.sellIn <= 10) {
            increaseQuality(item);
        }
        if (item.sellIn <= 5) {
            increaseQuality(item);
        }
        if (item.sellIn < 0) {
            resetQuality(item);
        }
    }

    private void updateAgedBrieQuality(Item item) {
        increaseQuality(item);
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality += 1;
        }
    }

    private void updateDefaultItemQuality(Item item) {
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > MIN_QUALITY) {
            item.quality -= 1;
        }
    }

    private void resetQuality(Item item) {
        item.quality = MIN_QUALITY;
    }

    private void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }
}
