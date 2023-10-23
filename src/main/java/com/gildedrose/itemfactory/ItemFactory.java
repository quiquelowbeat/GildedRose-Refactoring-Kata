package com.gildedrose.itemfactory;

import com.gildedrose.items.*;
import com.gildedrose.valueobjects.LegendaryQuality;
import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public class ItemFactory {

    private ItemFactory() {}

    public static Item createItemBy(String name, int sellIn, int quality){
        Name itemName = new Name(name);
        SellIn itemSellin = new SellIn(sellIn);
        Quality itemQuality = new Quality(quality);

        if(itemName.isAgedBrie()) return new AgedBrie(itemName, itemSellin, itemQuality);
        if(itemName.isSulfuras()) return new Sulfuras(itemName, itemSellin,
            new LegendaryQuality());
        if(itemName.isBackstagePass()) return new BackstagePass(itemName, itemSellin,
            itemQuality);
        if(itemName.isConjured()) return new ConjuredItem(itemName, itemSellin, itemQuality);
        return new DefaultItem(itemName, itemSellin, itemQuality);
    }
}
