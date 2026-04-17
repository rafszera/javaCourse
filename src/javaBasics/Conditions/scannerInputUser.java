package javaBasics.Conditions;

import java.util.Scanner;

public class scannerInputUser {
    public static void main(String[] args) {
        /*
        * The user will create a character using Scanner inputs
        * */

        Scanner textBox = new Scanner(System.in);
        System.out.println("Create your ninja");
        System.out.print("Name: " );
        String ninjaName = textBox.nextLine();
        System.out.print("Age: ");
        int ninjaAge = textBox.nextInt();
        System.out.print("Number of missions already done: ");
        int numberMissions = textBox.nextInt();
        String rank;
        if (ninjaAge >= 21 && numberMissions >= 50){
            rank = "Jonin";
            System.out.println("Name: " + ninjaName + "\nAge: " + ninjaAge + "\nRank: " + rank);
        } else if (ninjaAge >= 14 && numberMissions >= 20){
            rank = "Chunin";
            System.out.println("Name: " + ninjaName + "\nAge: " + ninjaAge + "\nRank: " + rank);
        } else {
            rank = "Genin";
            System.out.println("Name: " + ninjaName + "\nAge: " + ninjaAge + "\nRank: " + rank);
        }


































        textBox.close();






    }
}
