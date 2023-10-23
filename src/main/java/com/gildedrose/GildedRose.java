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
                    item.sellIn = item.sellIn - 1;
                    if (item.quality < MAX_QUALITY) {
                        item.quality = item.quality + 1;
                    }
                    if (item.sellIn < 0) {
                        if (item.quality < MAX_QUALITY) {
                            item.quality = item.quality + 1;
                        }
                    }
                    break;
                case BACKSTAGE_PASSES:
                    item.sellIn = item.sellIn - 1;
                    if (item.quality < MAX_QUALITY) {
                        item.quality = item.quality + 1;
                    }
                    if (item.sellIn < 11 && item.quality < MAX_QUALITY) {
                        item.quality = item.quality + 1;
                    }
                    if (item.sellIn < 6 && item.quality < MAX_QUALITY) {
                        item.quality = item.quality + 1;
                    }
                    if (item.sellIn < 0) {
                        item.quality = MIN_QUALITY;
                    }
                    break;
                case SULFURAS:
                    break;
                default:
                    item.sellIn = item.sellIn - 1;
                    if (item.quality > MIN_QUALITY) {
                        item.quality = item.quality - 1;
                    }
                    if (item.sellIn < 0) {
                        if (item.quality > MIN_QUALITY) {
                            item.quality = item.quality - 1;
                        }
                    }
            }
        }
    }
}
