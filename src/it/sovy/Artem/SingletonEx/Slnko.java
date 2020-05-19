package it.sovy.Artem.SingletonEx;

import java.util.ArrayList;
import java.util.List;

public class Slnko {

    static List<Planeta> planets = new ArrayList<>();

    private static Slnko sln;

    private Slnko(){}

    public static Slnko getSlnko(){
        if (sln == null){
            sln = new Slnko();
        }
        return sln;
    }

    public static boolean addPlaneta(Planeta planeta){
        if (planeta != null){
            planets.add(planeta);
            return true;
        } else {
            System.out.println("Some error has been appeared in inputs!");
            return false;
        }
    }

    public static void showPlanets(){
        if (planets != null) {
            for (Planeta st : planets) {
                System.out.println("name: " + st.getName() + " mass: " + st.getMass() + " distance: " + st.getDistance());
            }
        }
    }
}
