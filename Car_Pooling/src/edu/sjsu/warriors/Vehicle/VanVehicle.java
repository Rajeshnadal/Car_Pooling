package edu.sjsu.warriors.Vehicle;

/**
 * Created by preet on 7/29/17.
 */
public class VanVehicle extends Vehicle {
    public VanVehicle (String vin, String make, String model, int year, VehicleOwnership ownership) {
        super(vin, make, model, year, ownership);
        seats = 7;
        vehicleSize = "L";
    }
}
