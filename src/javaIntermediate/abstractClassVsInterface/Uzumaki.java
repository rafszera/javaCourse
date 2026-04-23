package javaIntermediate.abstractClassVsInterface;

public class Uzumaki extends Ninja {
    String clanName = "Uzumaki";
    Bijuus bijuu;


    public Uzumaki(String name, int age, int completedMissions, Ranks rank, Bijuus bijuu) {
        super(name, age, completedMissions, rank);
        this.bijuu = bijuu;
    }

    public Uzumaki(String name, int age, int completedMissions, Ranks rank) {
        super(name, age, completedMissions, rank);
    }

    public Uzumaki() {
    }

    @Override
    public void village() {
        fromVillage = " a shinobi of Konohagakure";
        System.out.println("I am an " + clanName + fromVillage);
    }

    @Override
    public void ninjaName(){
        System.out.println("I'm " + name);
    }

      @Override
    public void shurikenThrow(){
        System.out.println("Throwing my Air Shuriken");
    }


}
