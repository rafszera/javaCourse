package javaIntermediate.OOP.Polymorphism;

public class Main {
    public static void main() {
        Uzumaki naruto = new Uzumaki();
        Uchiha sasuke = new Uchiha();

        naruto.name = "Naruto Uzumaki";
        naruto.age = 22;
        naruto.village = "Konoha";
        naruto.rank = "Hokage";
        naruto.specialAbility();



        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 23;
        sasuke.village = "Konoha";
        sasuke.rank = "ANBU";
        sasuke.specialAbility();
    }

}
