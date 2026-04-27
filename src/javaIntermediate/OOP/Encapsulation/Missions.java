package javaIntermediate.OOP.Encapsulation;

public class Missions {
    private String name;
    private Ranks rank;

    public Missions(String name, Ranks rank) {
        this.name = name;
        this.rank = rank;
    }

    public Missions() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public void showDetails(){
        System.out.println("Mission name: " + getName() + " \nMission Rank: " +getRank() + "\nMission Complexity: " + rank.getComplexity() + "\nMission Difficulty: " + rank.getDifficulty());

    }


}
