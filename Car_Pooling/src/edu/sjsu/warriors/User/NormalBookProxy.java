package edu.sjsu.warriors.User;

import edu.sjsu.warriors.Order.Order;

public class NormalBookProxy implements AdminProxy{
    private Admin admin;

    public NormalBookProxy() {
        admin = Admin.getInstance();
    }

    public Order createOrder(Passenger passenger) {
        return admin.createOrder(passenger);
    }

    public void cancelOrder(String userID) {
        admin.cancelOrder(userID);
    }
}
