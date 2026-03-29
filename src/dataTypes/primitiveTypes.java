package dataTypes;

import java.util.Scanner;

public class primitiveTypes {
    public static void main(String[] args) {
/*
* Primitive data - int, double, float, char, boolean, short.
*/

    int ageTest = 16;
        System.out.println("Age: " + ageTest);
    double heightTest = 1.70;
        System.out.println("Height: " + heightTest);
    char letterTest = 'N';
        System.out.println("Initial Letter: " + letterTest);
    boolean deadOrAlive = true;
        System.out.println("Alive? " + deadOrAlive);
    long currentBalance = 140393L;
        System.out.println("Current bank balance: $" + currentBalance);


    /*
    * Little scanner + else if test
    */


    Scanner newScn = new Scanner(System.in);
       System.out.println("Type what you want: ");
       String inputUser = newScn.nextLine();

       if (inputUser.equals("Current balance")){
           System.out.println("$" + currentBalance);
       } else {
           System.out.println("Wrong input");
       }
        newScn.close();



















    }
}
