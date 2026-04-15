package javaIntermediate.abstractClassVsInterface;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.ninjaName();
        naruto.kunaiThrow();
        naruto.shurikenThrow();
        naruto.village();

        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.ninjaName();
        sasuke.kunaiThrow();

        Uchiha itachi = new Uchiha("Itachi Uchiha", 28);
        itachi.ninjaName();
        itachi.kunaiThrow();
        itachi.village();



    }
}
