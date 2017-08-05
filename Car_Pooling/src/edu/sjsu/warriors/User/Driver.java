package edu.sjsu.warriors.User;

import java.util.UUID;

public class Driver extends User {
    private boolean _isAvaiable;
    private String _license;
    private String _insurance;
    private Admin admin = Admin.getInstance();

    public Driver() {
        super();
    }

    public Driver(String userID, String email, String phone, String pwd) {
        _userID = userID;
        _email = email;
        _phone = phone;
        _pwd = pwd;
        _isAvaiable = true;

        //this.admin.addDriver(this);
    }

    public boolean isAvaiable() {
        return _isAvaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this._isAvaiable = avaiable;
    }


    //Constructor
    public Driver(String name, String phoneNumber, String email, String license, String insurance) {
        super();
        this._name = name;
        this._phoneNumber = phoneNumber;
        this._email = email;
        this._id = UUID.randomUUID().toString();
        this._license = license;
        this._insurance = insurance;
        this.admin.attach(this);
        //admin.addDriver(this);
    }

    public void set_license(String _license) {
        this._license = _license;
    }

    public void set_insurance(String _insurance) {
        this._insurance = _insurance;
    }

    public String get_license() {
        return this._license;
    }

    public String get_insurance() {
        return this._insurance;
    }

    public boolean signup() {
        _AAA.SignUp(this);
        System.out.println("Singup complete for Driver:" + this.getUserID());
        return true;
    }

    public User login() {
        User driver = _AAA.SignIn(this._userID, this._pwd);
        if ( driver != null) {
            System.out.println("SingIn Successfully for Driver:" + this.getUserID());
            return driver;
        } else {
            System.out.println("SingIn FAIL for Driver:" + this.getUserID());
            return null;
        }
    }

    public void notifyusers(String name)
    {
        System.out.println(" Driver with licence notified:" );
    }
}