package javaIntermediate.abstractClassVsInterface;

public abstract class Ninja implements NinjaInterface, Konoha {
    String name;
    int age;
    String fromVillage;


    // General method can have a body { }

    @Override
    public void kunaiThrow() {
        System.out.println("Throwing my Kunai");
    }
    // Every abstract method must be implemented by every class
    // Abstract method doesn't have a body { }

    @Override
    public void shurikenThrow(){
        System.out.println("Throwing my Shuriken");

    }
    public abstract void ninjaName();

    @Override
    public abstract void village();


    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
        }

    public Ninja() {
    }
}
