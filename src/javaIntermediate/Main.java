package javaIntermediate;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.myname();

        // Create ninja Sasuke =
        Ninja Sasuke = new Ninja();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Konoha";
        Sasuke.age = 22;
        Sasuke.sharinganActive();
        String callingNameSasuke = Sasuke.myname();
        System.out.println(callingNameSasuke);

        int sasukeToHokage = Sasuke.ageToHokage(40);
        System.out.println(Sasuke.name + " can be Hokage in " + sasukeToHokage + " years.");



        // Create ninja Naruto
        Ninja Naruto = new Ninja();

        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Konoha";
        Naruto.age = 17;





    }
}
