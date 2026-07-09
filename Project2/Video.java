package Project2;

public class Video {

    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    public Video(String name) {
        videoName = name;
        checkout = false;
        rating = 0;
    }

    // Returns video name
    public String getName() {
        return videoName;
    }

    // Check out the video
    public void doCheckout() {
        checkout = true;
    }

    // Return the video
    public void doReturn() {
        checkout = false;
    }

    // Receive rating
    public void receiveRating(int rating) {
        this.rating = rating;
    }

    // Get rating
    public int getRating() {
        return rating;
    }

    // Get checkout status
    public boolean getCheckout() {
        return checkout;
    }
}