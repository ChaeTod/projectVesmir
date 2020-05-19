package it.sovy.Artem.SingletonEx;

public class Planeta {

    private String name;
    private String mass;
    private long distance;

    public Planeta(String name, String mass, long distance) {
        this.name = name;
        this.mass = mass;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getMass() {
        return mass;
    }

    public long getDistance() {
        return distance;
    }
}
