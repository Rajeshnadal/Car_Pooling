package edu.sjsu.warriors.Report;

import edu.sjsu.warriors.User.Driver;

import java.util.*;


/**
 * Created by preet on 7/29/17.
 */
public class DriverReport extends Report {
    private Driver driver;

    public DriverReport(Driver driver) {
        this.driver = driver;
        set_description("Driver Report");
    }

    public void printReport() {
        System.out.println("\n" + _description);
        System.out.println("=====================================================================");
        System.out.println("Id       : " + driver.get_id());
        System.out.println("Name     : " + driver.get_name());
        System.out.println("Phone#   : " + driver.get_phoneNumber());
        System.out.println("License  : " + driver.get_license());
        System.out.println("Insurance: " + driver.get_insurance());
        System.out.println("=====================================================================");
    }
}
