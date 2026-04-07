package Tasks;

import java.util.Scanner;
import java.util.Arrays;

public class secondTask {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int maxNinjas = 10;
        String[] ninjas = new String[maxNinjas];

        int ninjaRegistry = 0;
        int option = 0;

        while (option != 3) {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Ninja Team Registration");
            System.out.println("2. Team Member list");
            System.out.println("3. Exit");
            System.out.print("Choose one option: ");
            option = userInput.nextInt();
            userInput.nextLine();

            switch (option) {
                case 1:
                    while (ninjaRegistry < maxNinjas) {
                        System.out.println("Type the ninja name (or type '4' to go back to menu):");
                        String ninjaName = userInput.nextLine();

                        if (ninjaName.equals("4")) {
                            System.out.println("Returning to menu...");
                            break;
                        } else {
                            ninjas[ninjaRegistry] = ninjaName;
                            ninjaRegistry++;
                            System.out.println("Registry done! (" + ninjaRegistry + "/" + maxNinjas + " ninjas registered)");
                        }
                    }

                    if (ninjaRegistry == maxNinjas) {
                        System.out.println("List is full, cannot register a new ninja.");
                    }
                    break;

                case 2:
                    if (ninjaRegistry == 0) {
                        System.out.println("The team list is empty");
                    } else {
                        System.out.println("==== Team Member List ====");
                        System.out.println(Arrays.toString(Arrays.copyOf(ninjas, ninjaRegistry)));
                    }
                    break;

                case 3:
                    System.out.println("Shutting down..");
                    break;

                default:
                    System.out.println("Wrong input, try again later");
                    break;
            }
        }

        userInput.close();
    }
}