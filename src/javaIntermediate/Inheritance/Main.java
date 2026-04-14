package javaIntermediate.Inheritance;

public class Main {
    static void main(String[] args) {


        // Object 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Konoha";
        Naruto.age = 17;
        Naruto.senninMode();

        // Object 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Konoha";
        Sasuke.age = 18;
        Sasuke.sharinganActive();

        // Object 3
         Ninja Sakura = new Ninja();
         Sakura.name = "Sakura Haruno";
         Sakura.village = "Konoha";
         Sakura.age = 17;

         // Object 4
        Ninja Kakashi = new Ninja();
        Kakashi.name = "Kakashi Hatake";
        Kakashi.village = "Konoha";
        Kakashi.age = 40;

        // Object 5
        Hyuga Hinata = new Hyuga();
        Hinata.name = "Hinata Hyuga";
        Hinata.village = "Konoha";
        Hinata.age = 17;
        Hinata.activeByakugan();




















//        Ninja ninja = new Ninja();
//        ninja.myname();
//        String callingNameSasuke = Sasuke.myname();
//        System.out.println(callingNameSasuke);
//        int sasukeToHokage = Sasuke.ageToHokage(40);
//        System.out.println(Sasuke.name + " can be Hokage in " + sasukeToHokage + " years.");




    }
}
