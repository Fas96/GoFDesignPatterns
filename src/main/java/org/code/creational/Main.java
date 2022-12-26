package org.code.creational;

public class Main {
    public static void main(String[] args) {

        var orderManagementServiceSingleton = OrderManagementServiceSingleton.getInstance();
        var orderManagementServiceSingleton2 = OrderManagementServiceSingleton.getInstance();

        System.out.println(orderManagementServiceSingleton==orderManagementServiceSingleton2);
        System.out.println("orderManagementServiceSingleton!");
    }
}