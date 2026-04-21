package javaIntermediate.abstractClassVsInterface;

import javaIntermediate.Tasks.Ninja;

public enum Bijuu {

    ICHIBI("Shukaku", 1),
    NIBI("Matatabi",2),
    SANBI("Isobu",3),
    YONBI("Son Goku",4),
    GOBI("Kokuo",5),
    ROKUBI("Saiken",6),
    SHICHIBI("Chomel",7),
    HACHIBI("Gyuki",8),
    KYUUBI("Kurama",9);

    public final String bijuuName;
    public final int tails;

    Bijuu(String bijuuName, int tails) {
        this.bijuuName = bijuuName;
        this.tails = tails;

    }


}
