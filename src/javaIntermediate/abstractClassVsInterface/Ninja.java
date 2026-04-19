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
    final public void kunaiThrow() {
        System.out.println("Throwing my Kunai");
    }


    @Override
    final public void kunaiThrow(Element element) {
        if (element == Element.FIRE){
            System.out.println("Throwing a Fire-style Kunai");
        } else if (element == Element.EARTH) {
            System.out.println("Throwing an Earth-style Kunai");
        } else if (element == Element.WIND) {
            System.out.println("Throwing a Wind-style Kunai");
        } else if (element == Element.WATER) {
                System.out.println("Throwing a Water-style Kunai");
        } else if (element == Element.LIGHTNING) {
            System.out.println("Throwing a Lightning-style Kunai");
        } else kunaiThrow();


    }
    // Every abstract method must be implemented by every class
    // Abstract method doesn't have a body { }
    @Override
    public void shurikenThrow(){
        System.out.println("Throwing my Shuriken");
    }

    public abstract void village();

    public abstract void ninjaName();

    @Override
    public void combatIntelligence(int IQ){
        if (IQ >= 200){
            System.out.println(name + ", your battle IQ is: " + IQ + ", you are a true genius");
        }
    }

    @Override
    final public String toString() {
        return name + age;

    }
}
