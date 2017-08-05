package edu.sjsu.warriors.User;

/**
 * Created by schen on 7/31/17.
 */
public class PassengerFactory extends Creator {
    public User createUser(String userID, String email, String phone, String pwd) {
        User _usr = new Passenger();
        _usr.setUserID(userID);
        _usr.setUserEmail(email);
        _usr.setUserPhone(phone);
        _usr.setPwd(pwd);
        _usr.setRole("Passenger");
        return _usr;
    }
}
