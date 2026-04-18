package javaIntermediate.abstractClassVsInterface;

public class Main {
    public static void main(String[] args) {


        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.ninjaName();
        naruto.village();
        naruto.kunaiThrow();
        naruto.shurikenThrow();

        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.ninjaName();
        sasuke.village();
        sasuke.kunaiThrow();

        Uchiha itachi = new Uchiha("Itachi Uchiha", 28);
        itachi.ninjaName();
        itachi.village();
        itachi.kunaiThrow();
        itachi.sharinganActive();

        Hatake kakashi = new Hatake();
        kakashi.name = "Kakashi";
        kakashi.ninjaName();
        kakashi.village();
        kakashi.sharinganActive();
        kakashi.age = 35;
        kakashi.ninjaAnbu();

        Uzumaki kushina = new Uzumaki("Kushina Uzumaki", 28, 80, Ranks.JONIN);
        kushina.ninjaName();
        kushina.village();
        if (kushina.completedMissions >= 70 && kushina.rank == Ranks.JONIN) {
            System.out.println("I have completed " + kushina.completedMissions + " missions.");
            System.out.println("I have already reached " + kushina.rank + " rank");
            System.out.println(kushina.name + " meet the requirements to become an ANBU member");
        }


    }
}
