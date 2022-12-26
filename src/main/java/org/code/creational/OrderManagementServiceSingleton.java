package org.code.creational;

public class OrderManagementServiceSingleton {
    private static OrderManagementServiceSingleton instance = null;
    private OrderManagementServiceSingleton() {
    }
    public static synchronized OrderManagementServiceSingleton getInstance() {
        if (instance == null) {
            instance = new OrderManagementServiceSingleton();
        }
        return instance;
    }
}
