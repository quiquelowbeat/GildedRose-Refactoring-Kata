package com.gildedrose;

import com.gildedrose.items.DefaultItem;
import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        DefaultItem defaultItem = new DefaultItem("foo", 0, 0);
        Item[] items = new Item[] {defaultItem};
        GildedRose app = new GildedRose();
        app.updateQuality(items);
        assertEquals(-1, items[0].sellIn().value());
    }

}
