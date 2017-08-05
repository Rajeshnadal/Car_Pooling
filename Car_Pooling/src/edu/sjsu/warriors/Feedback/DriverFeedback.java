package edu.sjsu.warriors.Feedback;
public class DriverFeedback extends Feedback {
    public DriverFeedback(String content, int rating) {
        super(content, rating);
    }

    public void setType(){
        System.out.println("***** This is a Passenger's feedback*******");
    }

    public String getType() {
        return "Driver";
    }
}
