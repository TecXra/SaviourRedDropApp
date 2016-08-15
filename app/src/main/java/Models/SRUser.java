package Models;

import java.util.ArrayList;

/**
 * Created by Ali ( 03154342359 ) on 7/28/2016.
 */
public class SRUser {

String Id,Name,Blood,City,Contact;
ArrayList<UserReview> reviews;
    public SRUser() {
    }

    public SRUser(String id, String name, String blood, String city, String contact) {
        Id = id;
        Name = name;
        Blood = blood;
        City = city;
        Contact = contact;
    }

    public ArrayList<UserReview> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<UserReview> reviews) {
        this.reviews = reviews;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBlood() {
        return Blood;
    }

    public void setBlood(String blood) {
        Blood = blood;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
