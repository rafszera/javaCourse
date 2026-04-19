package javaIntermediate.abstractClassVsInterface;

public class Uchiha extends Ninja implements Sharingan {

    String clanName = "Uchiha";
    public Uchiha(String name, int age) {
        super(name, age);
    }

    public Uchiha(){
        super();
    }

    @Override
    public void sharinganActive(){
        System.out.println("My bloodline does not lie. The Sharingan sees all");
    }

    @Override
    public void ninjaName(){
        System.out.println("I'm " + name);
    }


    @Override
    public void village(){
        fromVillage = " from Konohagakure!";
        System.out.println("I'm a " + clanName + fromVillage);
    }



}
