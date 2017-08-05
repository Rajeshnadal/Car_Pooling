package edu.sjsu.warriors.Order;

import edu.sjsu.warriors.User.Driver;

// Administrator class could have one property:
// ArrayList<Order> orders;
public class Order {
    String userID;
    Driver driver;

    public String getUserID() {
        return userID;
    }

    // getter of Driver
    public Driver getDriver() {
        return driver;
    }

    // When a passenger want a carpool, it means he/she has a new order
    public Order(String userID) {
        this.userID = userID;
    }

    // System admin should assign a driver to this order;
    public void assignDriver(Driver driver) {
        this.driver = driver;
    }
}