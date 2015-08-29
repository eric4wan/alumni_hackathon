package gatech.hackathon_app;

import com.google.android.gms.maps.model.LatLng;

public class Person {
    private String name;
    private LatLng location;

    public Person(String name, LatLng location) {
        this.name = name;
        this.location = location;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}