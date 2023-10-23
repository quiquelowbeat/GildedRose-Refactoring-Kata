package com.gildedrose;

import com.gildedrose.itemfactory.ItemFactory;
import com.gildedrose.items.*;

public class GildedRoseMain {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
            ItemFactory.createItemBy("+5 Dexterity Vest", 10, 20),
            ItemFactory.createItemBy("Aged Brie",2, 0),
            ItemFactory.createItemBy("Elixir of the Mongoose", 5, 7),
            ItemFactory.createItemBy("Sulfuras, Hand of Ragnaros", 0, 50),
            ItemFactory.createItemBy("Sulfuras, Hand of Ragnaros", -1, 50),
            ItemFactory.createItemBy("Backstage passes to a TAFKAL80ETC concert",15, 20),
            ItemFactory.createItemBy("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            ItemFactory.createItemBy("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            ItemFactory.createItemBy("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose();

        int days = 3;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            int day = i + 1;
            System.out.println("-------- day " + day + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality(items);
        }
    }

}
