package javaBasics.Conditions;

import java.util.Scanner;

public class switchCases {
    static void main(String[] args) {

        Scanner scannerBox = new Scanner(System.in);

        System.out.println("Chose a character number:");
        System.out.println("1 - Naruto" + "\n2 - Sasuke" + "\n3 - Sakura");


        int numberNinja = scannerBox.hasNextInt() ? scannerBox.nextInt() : 0;
        System.out.println("You typed number " + numberNinja);

        switch (numberNinja) {
            case 1:
                System.out.println("You chose Naruto");
                break;
            case 2:
                System.out.println("You chose Sasuke");
                break;
            case 3:
                System.out.println("You chose Sakura");
                break;
            default:
                System.out.println("WRONG INPUT");

        }


























































        scannerBox.close();
    }
}



