package javaBasics.Tasks;

public class firstTask {
    static void main(String[] args) {

        String ninjaName1 = "Naruto";
        int ninjaAge1 = 18;
        String ninjaName2 = "Sasuke";
        int ninjaAge2 = 20;

        String taskOne = "Escort the villager through the forest";
        String taskTwo = "Scout the hidden mist village area";
        char taskOneLevel = 'A';
        char taskTwoLevel = 'S';
        String statusMission = "Mission";


        System.out.println("Name: " + ninjaName1 + "\nAge: " + ninjaAge1 + "\nMission: " + taskOne + "\nMission Rank: " + taskOneLevel);
        if (ninjaAge1 < 18 && taskOneLevel == 'A'){
            System.out.println("Status: " + statusMission + " Failed");
        } else {
            System.out.println("Status: " + statusMission + " Completed");
        }
        System.out.println("\n------------------------------------\n");

        System.out.println("Name: " + ninjaName2 + "\nAge: " + ninjaAge2 + "\nMission: " + taskTwo + "\nMission Rank: " + taskTwoLevel);

        if(ninjaAge2 < 21 && taskTwoLevel == 'S'){
            System.out.println("Status: " + statusMission +  " Failed");
        } else {
            System.out.println("Status: " + statusMission + " Completed");
        }






    }

}
