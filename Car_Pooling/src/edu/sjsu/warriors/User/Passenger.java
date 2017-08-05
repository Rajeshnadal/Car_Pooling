package edu.sjsu.warriors.User;

public class Passenger extends User {
    private NormalBookProxy normalBookProxy;

    public boolean signup() {
        _AAA.SignUp(this);
        System.out.println("Singup complete for PASSENGER:" + this.getUserID());
        return true;
    }

    public User login() {
        User passenger = _AAA.SignIn(this._userID, this._pwd);
        if (passenger != null) {
            System.out.println("SingIn Successfully for PASSENGER:" + this.getUserID());
            return passenger;
        } else {
            System.out.println("SingIn FAIL for PASSENGER:" + this.getUserID());
            return null;
        }
    }


    public void notifyusers(String name)
    {
        System.out.println("SingIn for Driver:" );
    }

    // Leonard
    // Proxy Pattern
    // Book a car
    public void bookOrder(Admin admin) {
        normalBookProxy = new NormalBookProxy();
        normalBookProxy.createOrder(this);
    }
    // Cancel the book from Admin
    public void cancelOrder(Admin admin) {
        normalBookProxy = new NormalBookProxy();
        normalBookProxy.cancelOrder(this._userID);
    }
}