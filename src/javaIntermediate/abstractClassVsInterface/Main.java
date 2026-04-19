package javaIntermediate.abstractClassVsInterface;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.ninjaName();
        naruto.village();
        naruto.kunaiThrow(Element.WIND);
        naruto.shurikenThrow();
        System.out.println(naruto);
        System.out.println("--------------------------------------");
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.ninjaName();
        sasuke.village();
        sasuke.kunaiThrow(Element.LIGHTNING);
        System.out.println("--------------------------------------");
        Uchiha itachi = new Uchiha("Itachi Uchiha", 28);
        itachi.ninjaName();
        itachi.village();
        itachi.kunaiThrow();
        itachi.sharinganActive();
        System.out.println("--------------------------------------");
        Hatake kakashi = new Hatake();
        kakashi.name = "Kakashi";
        kakashi.ninjaName();
        kakashi.village();
        kakashi.sharinganActive();
        kakashi.age = 35;
        kakashi.ninjaAnbu();
        System.out.println("--------------------------------------");
        Uzumaki kushina = new Uzumaki("Kushina Uzumaki", 28, 80, Ranks.JONIN);
        kushina.ninjaName();
        kushina.village();
        if (kushina.completedMissions >= 70 && kushina.rank == Ranks.JONIN) {
            System.out.println("I have completed " + kushina.completedMissions + " missions.");
            System.out.println("I have already reached " + kushina.rank + " rank");
            System.out.println(kushina.name + " meet the requirements to become an ANBU member");
        }
        System.out.println("--------------------------------------");
        Uchiha madara = new Uchiha("Madara Uchiha", 30);
        madara.ninjaName();
        madara.village();
        madara.combatIntelligence(210);
        madara.sharinganActive();
        madara.kunaiThrow(Element.FIRE);
        System.out.println("--------------------------------------");

    }
}
