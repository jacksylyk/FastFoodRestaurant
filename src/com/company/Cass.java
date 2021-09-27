package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cass {
    List<Customer> customers = new ArrayList<>();
    private String order_name;

    public void order(Customer customer){
        customers.add(customer);
    }

    public void unorder(Customer customer){
        customers.remove(customer);
    }

    public void accept_order(){
        for(Customer customer : customers){
            customer.update();
        }
    }

    public void accepting(String order_name){
        this.order_name = order_name;
        accept_order();
    }

}
