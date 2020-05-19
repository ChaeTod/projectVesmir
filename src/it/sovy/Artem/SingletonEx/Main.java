package it.sovy.Artem.SingletonEx;

public class Main {
    public static void main(String[] args){

        Planeta pln = new Planeta("Mars", "123131232", 12341234);
        Planeta pln_1 = new Planeta("Vines", "234523453245", 1234355534);
        Planeta pln_2 = new Planeta("Moon", "11212341235", 123423452);
        Planeta pln_3 = new Planeta("Earth", "345634563456", 1245341234);

        Slnko.addPlaneta(pln);
        Slnko.addPlaneta(pln_1);
        Slnko.addPlaneta(pln_2);
        Slnko.addPlaneta(pln_3);
        Slnko.showPlanets();
    }
}
