package edu.sjsu.warriors.User;


import java.lang.*;
import java.util.*;

import edu.sjsu.warriors.Order.Order;

public  class Admin implements AdminProxy {
    private static Admin ourInstance;

    public List<Order> getOrders() {
        return orders;
    }

    private List<Order> orders;

    public List<Driver> getDrivers() {
        return drivers;
    }

    private List<Driver> drivers;
    private int state;

    // Singleton Pattern
    // Double Lock
    public static Admin getInstance() {
        if(ourInstance == null) {
            synchronized (Admin.class) {
                if(ourInstance == null) {
                    ourInstance = new Admin();
                }
            }
        }
        return ourInstance;
    }

    private List<User> observers = new ArrayList<>();

    private Admin() {
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    // Create and cancel orders for passengers
    // Leonard
    @Override
    public Order createOrder(Passenger passenger) {
        Order order = new Order(passenger.getUserID());
        int minDistance = Integer.MAX_VALUE;
        Driver minDriver = null;

        for(Driver driver: drivers) {
            if(driver.isAvaiable()) {
                int dis = calculateDistance(passenger, driver);
                if(dis < minDistance) {
                    minDistance = dis;
                    minDriver = driver;
                }
            }
        }

        return printResult(order, minDriver);
    }

    public Order createOrder(Passenger passenger, String driverName) {
        Order order = new Order(passenger.getUserID());
        Driver retDriver = null;

        for(Driver driver: drivers) {
            if(driver.get_name() == driverName) {
                retDriver = driver;
            }
        }

        return printResult(order, retDriver);
    }

    private Order printResult(Order order, Driver driver) {
        if(driver != null) {
            order.assignDriver(driver);
            driver.setAvaiable(false);
            System.out.println("Assign the closest driver => User ID: "
                    + driver.getUserID()
                    + ", User Name: " + driver.get_name());
            orders.add(order);
            System.out.println("User create a new order successfully");
            return order;
        }
        else {
            System.out.println("Fail! User cannot create a new order");
            return null;
        }
    }
    // Iterator Pattern
    @Override
    public void cancelOrder(String userID) {
        boolean hasMatchOrder = false;
        Iterator<Order> orderIterator = orders.iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if(order.getUserID().equals(userID)) {
                orders.remove(order);
                Driver driver = order.getDriver();
                driver.setAvaiable(true);
                hasMatchOrder = true;
                System.out.println("Release the driver => User ID: "
                        + driver.getUserID()
                        + ", User Name: " + driver.get_name());
                System.out.println("The order is canceled or released successfully");
                break;
            }
        }

        if(!hasMatchOrder) {
            System.out.println("No match order");
        }
    }

    public void addDriver(Driver driver) {
        System.out.println(driver._name);
        drivers.add(driver);
    }

//    From documentation of Math.hypot:
//    Returns: sqrt(x²+ y²) without intermediate overflow or underflow.
    private int calculateDistance(User pass, User driver) {
        return (int)Math.hypot(pass.getLongitude() - driver.getLongitude(),
                pass.getLatitude() - driver.getLatitude());
    }

    // Rajesh
    public void modifyDriverdetails(List<Driver> uname)
    {
        System.out.println("Select  the driver u want");

        for (int i = 0; i < uname.size(); i++) {
            System.out.println(uname.get(i).getUserID());
        }
        Scanner input = new Scanner(System.in);
        String pn = input.nextLine();
        uname.remove(pn);


        System.out.println("Deleted " + pn);

    }

    public void deletepassengerdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Delete the Details of the " + uname);
    }


    public void modifyPassengerdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Change the Details of the " + uname);


    }

    public void deletedriverdetails(String uname)
    {
        System.out.println("Accessing the details of the user datails and passenger details from data base" + uname);

        System.out.println("Delete the Details of the " + uname);
    }



    public int getState() {
        return state;
    }

    public void notifyerrors(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Driver observer){

        System.out.println("cmg"+observer._name);
        drivers.add(observer);
    }

    public void notifyAllObservers(){
        for (Driver observer : drivers) {
            System.out.println(observer.get_license());
            observer.notifyusers(observer._name);
        }
    }


}