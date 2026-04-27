package javaIntermediate.OOP.Encapsulation;

public enum Ranks {
    S("Elite", 15),
    A("Hard", 10),
    B("Normal", 6),
    C("Easy", 3),
    D("Beginner",1);

    private String Complexity;
    private int Difficulty;

    Ranks(String complexity, int difficulty) {
        Complexity = complexity;
        Difficulty = difficulty;
    }

    Ranks() {
    }

    public String getComplexity() {
        return Complexity;
    }

    public void setComplexity(String complexity) {
        Complexity = complexity;
    }

    public int getDifficulty() {
        return Difficulty;
    }

    public void setDifficulty(int difficulty) {
        Difficulty = difficulty;
    }
}
