package Models;

/**
 * Created by Ali ( 03154342359 ) on 7/28/2016.
 */
public class UserReview {

    String Id,FeedBack;

    public UserReview(String feedBack) {
        FeedBack = feedBack;
        }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFeedBack() {
        return FeedBack;
    }

    public void setFeedBack(String feedBack) {
        FeedBack = feedBack;
    }
}
