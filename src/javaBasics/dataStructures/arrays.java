package javaBasics.dataStructures;

import java.util.Scanner;

public class arrays {
   public static void main(String[] args) {
        String[][] teamAndNinjas = new String[4][5];


       Scanner scanner = new Scanner(System.in);

        teamAndNinjas[0][0] = "Team 7";
        teamAndNinjas[0][1] = "Kakashi";
        teamAndNinjas[0][2] = "Naruto";
        teamAndNinjas[0][3] = "Sasuke";
        teamAndNinjas[0][4] = "Sakura";

        teamAndNinjas[1][0] = "Team 8";
        teamAndNinjas[1][1] = "Kurenai";
        teamAndNinjas[1][2] = "Shino";
        teamAndNinjas[1][3] = "Kiba";
        teamAndNinjas[1][4] = "Hinata";

        teamAndNinjas[2][0] = "Team 9";
        teamAndNinjas[2][1] = "Gai";
        teamAndNinjas[2][2] = "Rock Lee";
        teamAndNinjas[2][3] = "Neji";
        teamAndNinjas[2][4] = "Tenten";

        teamAndNinjas[3][0] = "Team 10";
        teamAndNinjas[3][1] = "Asuma";
        teamAndNinjas[3][2] = "Shikamaru";
        teamAndNinjas[3][3] = "Chouji ";
        teamAndNinjas[3][4] = "Ino";

       System.out.println("===== Teams of Konoha =====");

       for (int i = 0; i < teamAndNinjas.length; i++) {
           System.out.println(teamAndNinjas[i][0]);
       }
       System.out.print("Choose your team: ");

        int teamNumber = scanner.nextInt();
       if (teamNumber == 7){
           System.out.println("You Chose Team Kakashi");
           for (int i = 1; i < teamAndNinjas[0].length; i++) {
               System.out.println(teamAndNinjas[0][i]);
           }
       } else if (teamNumber == 8){
           System.out.println("You chose Team Kurenai");
           for (int i = 1; i < teamAndNinjas[1].length; i++) {
               System.out.println(teamAndNinjas[1][i]);
           }
       } else if (teamNumber == 9){
           System.out.println("You Chose Team Gai");
           for (int i = 1; i < teamAndNinjas[2].length; i++) {
               System.out.println(teamAndNinjas[2][i]);
           }
       } else if (teamNumber == 10){
           System.out.println("You Chose Team Asuma");
           for (int i = 1; i < teamAndNinjas[3].length; i++) {
               System.out.println(teamAndNinjas[3][i]);
           }
       } else {
           System.out.println("Wrong input. Shutting down");
       }



        // System.out.println(Arrays.deepToString(teamAndNinjas));


        scanner.close();

  }
}
