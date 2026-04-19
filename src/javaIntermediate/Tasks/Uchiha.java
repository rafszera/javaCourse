package javaIntermediate.Tasks;

class Uchiha extends Ninja {
    public Uchiha(String name, int age) {
        super(name, age);
    }

    public Uchiha() {
    }

    @Override
    public void specialAbility(){
       specialAbility = "Amaterasu";

    }
    public void listInfo(){
        System.out.println("Name: " +name);
        System.out.println(name + " is casting an Special Hidden Ability: " + specialAbility);
        System.out.println("Mission: " +mission);
        System.out.println("Difficulty: " +missionDifficulty);
        System.out.println("Status: " +missionStatus);



    }

}
