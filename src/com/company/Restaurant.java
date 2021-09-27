package com.company;

public class Restaurant {

    public static void main(String[] args) {
        Cass chocofood = new Cass();

        Customer c1 = new Customer("Zhaksylyk", "Burger");
        Customer c2 = new Customer("Nurbolat", "Pizza");
        Customer c3 = new Customer("Gabiden", "Soup");

        chocofood.order(c1);
        chocofood.order(c2);
        chocofood.order(c3);

        c1.order_food(chocofood);
        c2.order_food(chocofood);
        c3.order_food(chocofood);

        chocofood.accepting("Order");

    }
}
