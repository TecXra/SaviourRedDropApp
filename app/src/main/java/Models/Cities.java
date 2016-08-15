package Models;

/**
 * Created by Ali ( 03154342359 ) on 7/28/2016.
 */
public class Cities {

    String Id,Cityname;

    public Cities() {
    }

    public Cities(String id, String cityname) {
        Id = id;
        Cityname = cityname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCityname() {
        return Cityname;
    }

    public void setCityname(String cityname) {
        Cityname = cityname;
    }
}
