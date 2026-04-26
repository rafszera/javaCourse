package javaIntermediate.Tasks.taskTwo;

public class Uchiha extends Ninja {

    public Uchiha(String name, int age, String village) {
        super(name, age, village);
    }

    public Uchiha() {
    }

    @Override
    public void ninjaName() {
        System.out.println(getName());

    }
}
