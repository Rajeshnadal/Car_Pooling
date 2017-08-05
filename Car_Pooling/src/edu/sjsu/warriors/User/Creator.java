package edu.sjsu.warriors.User;

/**
 * Created by schen on 7/31/17.
 */
public abstract class Creator {
    public abstract User createUser(String userID, String email, String phone, String pwd);
}
