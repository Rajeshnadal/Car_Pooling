package edu.sjsu.warriors.Vehicle;


import edu.sjsu.warriors.User.Driver;

/**
 * Created by preet on 7/29/17.
 */
public class VehicleAndDriver {
    private Vehicle vehicle;
    private Driver driver;

    //Constructor
    public VehicleAndDriver(Driver driver, Vehicle vehicle) {
        this.driver = driver;
        this.vehicle = vehicle;
    }

    public VehicleAndDriver() {}

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
