package javaIntermediate.abstractClassVsInterface;

public class Uchiha extends Ninja {


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
        System.out.println("My name is: " + name);
    }

    @Override
    public void kunaiThrow(){
        System.out.println("Throwing my FIRE Kunai");
    }

    public void village() {
        fromVillage = "Konohagakure";
        System.out.println("I'm a ninja from " + fromVillage);
    }
}
