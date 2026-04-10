package javaBasics.Conditions;

public class ifAndElse {
    static void main(String[] args) {
        String name = "Naruto";
        String rank;
        int age = 18;
        boolean hokage = false;
        int missionNumbers = 40;

        /*
        *    if (condition) { result }
        *    else { result if condition is false }
        *
        *    if + if + else = print everything thats true
        *    if + else if + else = print the first true condition and stop
        */


        if (missionNumbers >= 40 && age >= 18) {
            rank = "Jonin";
            System.out.println(rank);
        } else if (missionNumbers >= 20 && age >= 13){
            rank = "Chunin";
            System.out.println(rank);
        } else {
            System.out.println("Naruto still Genin");
        }


























    }
   }

