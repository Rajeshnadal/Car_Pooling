package edu.sjsu.warriors.Feedback;

abstract public class Feedback {
    private String content;
    private int rating;

    public Feedback(String content, int rating) {
        this.content = content;
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public int getRating() {
        return rating;
    }


    public void provideFeedback() {
        setType();
        setContent(getContent());
        setRating(getRating());
    }

    public void setContent(String content){
        System.out.println("Feedback Content: "+content);
    }
    public void setFeedbacker(String name){
        System.out.println(name);
    }
    public void setType(){}
    public void setRating(int rating){
        System.out.println("Rating: "+rating);
    }

    abstract public String getType();

}
