package edu.sjsu.warriors.Feedback;

public class PricingFeedback extends Feedback {
    public PricingFeedback(String content, int rating) {
        super(content, rating);
    }

    public void setType(){
        System.out.println("***** This is a pricing feedback*******");
    }

    public String getType() {
        return "Pricing";
    }
}
