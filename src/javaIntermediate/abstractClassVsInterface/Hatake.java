package javaIntermediate.abstractClassVsInterface;

public class Hatake extends Ninja implements Sharingan, Anbu {

    String clanName = "Hatake";

    public Hatake(String name, int age) {
        super(name, age);
    }

    public Hatake() {
    }

    @Override
    public void ninjaName(){
        System.out.println("I'm " + name + " Hatake");
    }

    @Override
    public void sharinganActive(){
        System.out.println("Sharingan!!");
    }

    @Override
    public void village(){
        fromVillage = " from Konohagakure!";
        System.out.println("I'm a " + clanName + fromVillage);
    }

    @Override
    public void ninjaAnbu(){
        System.out.println(name+ " is a member of the ANBU elite");
    }


}
