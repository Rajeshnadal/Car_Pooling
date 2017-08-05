package edu.sjsu.warriors.User;

/**
 * Created by schen on 7/31/17.
 */
public class DriverFactory extends Creator{
    public User createUser(String userID, String email, String phone, String pwd) {
        User _usr = new Driver(userID, email, phone, pwd);
        _usr.setRole("Driver");
        return _usr;
    }
}
