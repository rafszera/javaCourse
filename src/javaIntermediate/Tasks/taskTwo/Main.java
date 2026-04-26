package javaIntermediate.Tasks.taskTwo;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki",20, "Konoha");
        Uzumaki kushina = new Uzumaki("Kushina Uzumaki", 38, "Konoha");
        Uzumaki boruto = new Uzumaki("Boruto Uzumaki", 10, "Konoha");
        Uzumaki nagato = new Uzumaki("Nagato Uzumaki", 36, "Amegakure");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 21, "Konoha");
        Uchiha itachi = new Uchiha("Itachi Uchiha", 32, "Konoha");
        Uchiha madara = new Uchiha("Madara Uchiha", 60, "Konoha");
        Uchiha shisui = new Uchiha("Shisui Uchiha", 31, "Konoha");


        // Create a linked List with 7 ninjas
        LinkedList<Ninja> linkedNinjas = new LinkedList<>();
        linkedNinjas.add(naruto);
        linkedNinjas.add(kushina);
        linkedNinjas.add(nagato);
        linkedNinjas.add(sasuke);
        linkedNinjas.add(itachi);
        linkedNinjas.add(madara);
        linkedNinjas.add(shisui);

        // List ninjas using o(n)
        System.out.println("- - - - - First list of ninjas - - - - -");
        for (Ninja ninja : linkedNinjas){
            System.out.println(ninja);
        }
        // Add a ninja in the first Index
        linkedNinjas.add(0, (boruto));
        System.out.println("- - - - - Second list - - - - -");
        for (Ninja ninja : linkedNinjas){
            System.out.println(ninja);
        }
        // Remove the second ninja Index
        linkedNinjas.remove(1);
        System.out.println("- - - - - Third list - - - - -");
        for (Ninja ninja : linkedNinjas){
            System.out.println(ninja);
        }

        // Search a ninja by its Index




















    }
}
