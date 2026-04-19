package javaIntermediate.Tasks;

public abstract class Ninja implements NinjaInterface{

    String name;
    int age;
    String mission;
    String missionDifficulty;
    String missionStatus;
    String specialAbility;

    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Ninja() {
    }

    @Override
    public void specialAbility (){
        String specialAbility = "Fireball";
        System.out.println(name + "is casting an " + specialAbility);
    }

    public abstract void listInfo();


}
