package edu.sjsu.warriors.Vehicle;

/**
 * Created by preet on 7/29/17.
 */
public abstract class VehicleOwnership {
    protected String ownerName;

    public VehicleOwnership(String name) {
        ownerName = name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
