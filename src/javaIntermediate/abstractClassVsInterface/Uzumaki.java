package javaIntermediate.abstractClassVsInterface;

public class Uzumaki extends Ninja {

    public Uzumaki(String name, int age) {
        super(name, age);
    }

    public Uzumaki() {
    }

    @Override
    public void village() {
        fromVillage = "Konohagakure";
        System.out.println("I'm a ninja from " + fromVillage);

    }

    public void ninjaName(){
        System.out.println("My name is: " + name);
    }


    public void kunaiThrow(){
        System.out.println("Throwing my AIR Kunai");
    }

    public void shurikenThrow(){
        System.out.println("Throwing my Air Shuriken");
    }

}
