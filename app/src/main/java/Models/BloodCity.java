package Models;

import java.util.ArrayList;

/**
 * Created by Ali ( 03154342359 ) on 7/28/2016.
 */
public class BloodCity {

    ArrayList<BloodGroup> bg;
    ArrayList<Cities> city;

    public BloodCity(ArrayList<BloodGroup> bg, ArrayList<Cities> city) {
        this.bg = bg;
        this.city = city;
    }

    public ArrayList<BloodGroup> getBg() {
        return bg;
    }

    public void setBg(ArrayList<BloodGroup> bg) {
        this.bg = bg;
    }

    public ArrayList<Cities> getCity() {
        return city;
    }

    public void setCity(ArrayList<Cities> city) {
        this.city = city;
    }
}
