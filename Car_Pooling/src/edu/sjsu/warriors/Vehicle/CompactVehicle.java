package edu.sjsu.warriors.Vehicle;

/**
 * Created by preet on 7/29/17.
 */
public class CompactVehicle extends Vehicle {
    public CompactVehicle (String vin, String make, String model, int year, VehicleOwnership ownership) {
        super(vin, make, model, year, ownership);
        seats = 5;
        vehicleSize = "M";
    }
}
