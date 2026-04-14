package javaIntermediate.abstractClassVsInterface;

public class Uzumaki extends Ninja {

    @Override
    public void ninjaName(){
        System.out.println("My name is: " + name);
    }

    @Override
    public void kunaiThrow(){
        System.out.println("Throwing my AIR Kunai");
    }
}
