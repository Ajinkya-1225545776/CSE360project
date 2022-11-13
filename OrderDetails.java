package com.example.pizzatype;

import java.util.ArrayList;

public class OrderDetails {
    //fields
    private static int order_id = 221100;
    private ArrayList<String> orders = new ArrayList<String>();
    public String pizzaType;
    public String pizzaToppings;
    
    PizzaTypeController piz = new PizzaTypeController();
    orders = piz.getList();


    //constructor
    public OrderDetails(){
            OrderDetails orderDetails = new OrderDetails();
    }

    //methods
    public void addItem(String item){
    	trying.add(item);
    }

    public void getOrderDetails(){
    	  for (int i=0; i<orders.size(); i++) {
              System.out.println(orders.get(i));
          }
    }

    public void clearOrder(){
    	trying.removeAll(trying);
    	orders.removeAll(orders);
    }

    public int getNumber(){
        return order_id;
    }

    public void incrementOrderID(){
        order_id++;
    }
}
