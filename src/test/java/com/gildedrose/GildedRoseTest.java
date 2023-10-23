package com.gildedrose;

import com.gildedrose.items.DefaultItem;
import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new DefaultItem("foo", 0, 0) };
        GildedRose app = new GildedRose();
        app.updateQuality(items);
        assertEquals(-1, items[0].getSellIn());
    }

}
