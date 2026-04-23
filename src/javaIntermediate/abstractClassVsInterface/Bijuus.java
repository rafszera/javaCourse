package javaIntermediate.abstractClassVsInterface;

public enum Bijuus {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SONGOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String bijuName;
    String jinchuriki;
    int tailsCount;

    Bijuus() {
    }

    Bijuus(String bijuName, String jinchuriki, int tailsCount) {
        this.bijuName = bijuName;
        this.jinchuriki = jinchuriki;
        this.tailsCount = tailsCount;
    }
}