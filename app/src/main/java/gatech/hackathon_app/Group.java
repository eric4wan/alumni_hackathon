package gatech.hackathon_app;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Group {
    private LatLng location;
    private ArrayList<Person> people;

    public Group(LatLng location) {
        this.location = location;
        this.people = new ArrayList<Person>();
    }

    public ArrayList getPeople() {
        return people;
    }

    public LatLng getLocation() {
        return location;
    }

    public void addQueue(Person p) {
        people.add(0, p);
    }

    @Override
    public String toString() {
        String result = "";
        for (Person p : people) {
            result += p.getName() + ", ";
        }
        result.substring(0, result.length() - 3);
        return result;
    }

}