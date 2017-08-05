/*For Admin, if passengers want to book some specific driver,
* he directly book him by driver ID */
package edu.sjsu.warriors.User;

import edu.sjsu.warriors.Order.Order;

public class SpecificBookProxy implements AdminProxy{
    private Admin admin;
    private String driverName;

    public SpecificBookProxy(String driverName) {
        admin = Admin.getInstance();
        this.driverName = driverName;
    }

    public Order createOrder(Passenger passenger) {
        return admin.createOrder(passenger, driverName);
    }

    public void cancelOrder(String userID) {
        admin.cancelOrder(userID);
    }
}
