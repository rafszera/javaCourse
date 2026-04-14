package javaIntermediate.abstractClassVsInterface;

public abstract class Ninja {
    String name;
    int age;
    String village;



    public void kunaiThrow(){
        System.out.println("Throwing my a Kunai");
    }

    public abstract void ninjaName();

    public Ninja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public Ninja() {
    }
}
