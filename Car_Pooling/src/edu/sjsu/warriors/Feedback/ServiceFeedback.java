package edu.sjsu.warriors.Feedback;

public class ServiceFeedback extends Feedback {

    public ServiceFeedback(String content, int rating) {
        super(content, rating);
    }

    public void setType(){
        System.out.println("***** This is a service feedback*******");
    }

    public String getType() {
        return "Service";
    }

}
