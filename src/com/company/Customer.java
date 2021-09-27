package com.company;

public class Customer {
    private String name;
    private String food;
    private Cass cass = new Cass();

    public Customer(String name, String food) {
        super();
        this.name = name;
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void update(){
        System.out.println("Order " + getFood() + " accepted!");
    }

    public void order_food(Cass cass1){
        cass = cass1;
    }
}
