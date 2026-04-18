package javaIntermediate.abstractClassVsInterface;

public abstract class Ninja implements NinjaInterface, Konoha {
    String name;
    int age;
    String fromVillage;
    String clanName;
    int completedMissions;
    Ranks rank;

    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Ninja(String name, int age, int completedMissions, Ranks rank) {
        this(name , age);
        this.completedMissions = completedMissions;
        this.rank = rank;
    }

    public Ninja() {

    }

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

    public abstract void village();

    public abstract void ninjaName();





}
