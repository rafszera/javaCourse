package javaIntermediate.OOP.Inheritance;

public class Main {
   public static void main(String[] args) {


        // Object 1
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.village = "Konoha";
        naruto.age = 17;
        naruto.senninMode();

        // Object 2
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.village = "Konoha";
        sasuke.age = 18;
        sasuke.sharinganActive();

        // Object 3
         Ninja sakura = new Ninja();
        sakura.name = "Sakura Haruno";
        sakura.village = "Konoha";
        sakura.age = 17;

         // Object 4
        Ninja kakashi = new Ninja();
        kakashi.name = "Kakashi Hatake";
        kakashi.village = "Konoha";
        kakashi.age = 40;

        // Object 5
        Hyuga hinata = new Hyuga();
        hinata.name = "Hinata Hyuga";
        hinata.village = "Konoha";
        hinata.age = 17;
        hinata.activeByakugan();




















//        Ninja ninja = new Ninja();
//        ninja.myname();
//        String callingNameSasuke = Sasuke.myname();
//        System.out.println(callingNameSasuke);
//        int sasukeToHokage = Sasuke.ageToHokage(40);
//        System.out.println(Sasuke.name + " can be Hokage in " + sasukeToHokage + " years.");




    }
}
