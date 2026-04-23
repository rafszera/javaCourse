package javaIntermediate.Encapsulation;

public abstract class Ninja {

    private String name;
    private String village;
    private int age;
    private int missionsCompleted;
    // Show the variable to user = GET + VARIABLE NAME
    // Setter receive values


    public Ninja(String name, String village, int age, int missionsCompleted) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.missionsCompleted = missionsCompleted;
    }

    public Ninja() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMissionsCompleted() {
        return missionsCompleted;
    }

    public void setMissionsCompleted(int missionsCompleted) {
        this.missionsCompleted = missionsCompleted;
    }
}
