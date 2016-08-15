package Models;

/**
 * Created by Ali ( 03154342359 ) on 7/28/2016.
 */
public class BloodGroup {

    String Id,Bloodgroup;

    public BloodGroup() {
    }

    public BloodGroup(String id, String bloodgroup) {
        Id = id;
        Bloodgroup = bloodgroup;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }
}
