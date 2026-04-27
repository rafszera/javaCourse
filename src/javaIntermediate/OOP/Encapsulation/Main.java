package javaIntermediate.OOP.Encapsulation;

public class Main {
    static void main(String[] args) {

        System.out.println("========== NINJA NARUTO ==========");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Konoha",25,100);
        System.out.println(naruto.getName());
        System.out.println(naruto.getVillage());
        naruto.setMissionsCompleted(120);

        System.out.println("========== NINJA ITACHI ==========");
        Uchiha itachi = new Uchiha("Uchiha Itachi", "Konoha", 33, 250);
        System.out.println(itachi.getName());

        System.out.println("========== MISSIONS IN PROGRESS ==========");
        Missions mission01 = new Missions("Save the dog", Ranks.D);
        mission01.showDetails();
        System.out.println("==================================");
        Missions mission02 = new Missions("Defeat Zabuza", Ranks.A);
        mission02.showDetails();






    }
}
