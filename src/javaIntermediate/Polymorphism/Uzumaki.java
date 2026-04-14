package javaIntermediate.Polymorphism;

public class Uzumaki extends Ninja{

    void activateSenninMode(){
        System.out.println(name + "... SENNIN MODE!!!");
    }

    @Override
    void specialAbility(){
        System.out.println("My name is " + name + " and this is my special Uzumaki air ability");
    }

}
