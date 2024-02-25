package com.yq;

public class Buyer {
    private int apples;
    private int strawberries;
    private int mangoes;

    public Buyer(int apples, int strawberries, int mangoes) {
        this.apples = apples;
        this.strawberries = strawberries;
        this.mangoes = mangoes;
    }

    public int getApples() {
        return apples;
    }

    public int getStrawberries() {
        return strawberries;
    }

    public int getMangoes() {
        return mangoes;
    }
}
