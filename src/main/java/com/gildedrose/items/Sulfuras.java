package com.gildedrose.items;

import com.gildedrose.valueobjects.Name;
import com.gildedrose.valueobjects.Quality;
import com.gildedrose.valueobjects.SellIn;

public final class Sulfuras extends Item {


    public Sulfuras(Name name, SellIn sellIn, Quality quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // Sulfuras quality not affected
    }

}

