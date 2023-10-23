package com.gildedrose;

import com.gildedrose.items.Item;

class GildedRose {

    public void updateQuality(Item[] items) {
        for (Item item : items) {
            item.updateQuality();
        }
    }
}
