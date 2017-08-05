package edu.sjsu.warriors.User;


import edu.sjsu.warriors.AAA.AAA;


public abstract class User {
    //preethi
    protected String _name;
    protected String _phoneNumber;
    protected String _id;
    //stephen
    protected String _userID;
    protected String _email;
    protected String _phone;
    protected String _pwd;
    protected String _role;
    protected AAA _AAA;

    //Leonard
    protected double _longitude;
    protected double _latitude;

    public double getLongitude() {
        return _longitude;
    }

    public void setLongitude(double longitude) {
        this._longitude = longitude;
    }

    public double getLatitude() {
        return _latitude;
    }

    public void setLatitude(double latitude) {
        this._latitude = latitude;
    }

    public abstract boolean signup();
    public abstract User login();


    User() {
        _AAA = AAA.getInstance();
    }

    public String getUserID() {
        return _userID;
    }

    public void setUserID(String userID) {
        this._userID = userID;
    }

    public String getUserEmail() {
        return _email;
    }

    public void setUserEmail(String userEmail) {
        this._email = userEmail;
    }

    public String getUserPhone() {
        return _phone;
    }

    public void setUserPhone(String userPhone) {
        this._phone = userPhone;
    }

    public String getPwd() {
        return _pwd;
    }

    public void setPwd(String pwd) {
        this._pwd = pwd;
    }

    public String getRole() {
        return _role;
    }

    public void setRole(String role) {
        this._role = role;
    }

    //preethi
    public String get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public String get_email() {
        return _email;
    }

    public void set_name(String _firstName) {
        this._name = _firstName;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    abstract public void notifyusers(String name);
}