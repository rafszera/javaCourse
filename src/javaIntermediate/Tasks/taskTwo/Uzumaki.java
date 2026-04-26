package javaIntermediate.Tasks.taskTwo;

public class Uzumaki extends Ninja {

    public Uzumaki(String name, int age, String village) {
        super(name, age, village);
    }

    public Uzumaki() {
    }
    @Override
    public void ninjaName(){
        System.out.println(getName());
    }


}
