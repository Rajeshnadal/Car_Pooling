package edu.sjsu.warriors.Vehicle;

/**
 * Created by preet on 7/29/17.
 */
public interface VehicleState {
    void free();

    void schedule();

    void operate();

    void finish();
}