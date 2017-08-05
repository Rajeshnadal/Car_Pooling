package edu.sjsu.warriors.User;

import edu.sjsu.warriors.Order.Order;

public interface AdminProxy {
    Order createOrder(Passenger passenger);
    void cancelOrder(String userID);
}
