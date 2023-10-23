package com.gildedrose.valueobjects;

public class Name {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String CONJURED = "conjured";

    private final String value;

    public Name(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public boolean isAgedBrie(){
        return value.equals(AGED_BRIE);
    }

    public boolean isSulfuras(){
        return value.equals(SULFURAS);
    }

    public boolean isBackstagePass(){
        return value.equals(BACKSTAGE_PASS);
    }

    public boolean isConjured(){
        return value.toLowerCase().contains(CONJURED);
    }

    @Override
    public String toString() {
        return value;
    }

}
