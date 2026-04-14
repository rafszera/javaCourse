package javaIntermediate.abstractClassVsInterface;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.ninjaName();
        naruto.kunaiThrow();

        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.ninjaName();
        sasuke.kunaiThrow();

    }
}
