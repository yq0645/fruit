package com.yq;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("苹果", 8);
        Fruit strawberry = new Fruit("草莓", 13);
        Fruit mango = new Fruit("芒果", 20);

        Buyer buyerA = new Buyer(3, 5, 0);
        double totalA = Seller.calculateTotalPrice(buyerA, apple, strawberry, mango);
        System.out.println("顾客 A 购买[苹果3斤，草莓5斤]总价: " + totalA);

        Buyer buyerB = new Buyer(3, 5, 1);
        double totalB = Seller.calculateTotalPrice(buyerB, apple, strawberry, mango);
        System.out.println("顾客 B 购买[苹果3斤，草莓5斤，芒果1斤]总价: " + totalB);

        Buyer buyerC = new Buyer(3, 5, 1);
        strawberry.setPrice(strawberry.getPrice()*Seller.DISCOUNT);
        double totalC = Seller.calculateTotalPrice(buyerC, apple, strawberry,mango );
        System.out.println("顾客 C 购买[苹果3斤，草莓5斤，芒果1斤]总价（打折后）: " + totalC);

        Buyer buyerD = new Buyer(2, 2, 14);
        double totalD = Seller.calculateTotalPrice(buyerD, apple, strawberry, mango);
        if (totalD >= 100) {
            totalD -= Math.floor(totalD / 100) * 10;
        }
        System.out.println("顾客 D 购买[苹果2斤，草莓2斤，芒果14斤]总价（满减后）: " + totalD);
    }
}
