package UI;
import Pets.CreateTamagotchiCharacter;
import Pets.TamagotchiCharacters;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
//This class has been made for the user to create his own character

public class CreateCharacter {

    static private CreateTamagotchiCharacter characters = new CreateTamagotchiCharacter();
    static Scanner scanner = new Scanner(System.in);
    static int age = 0;
    static String mood = "Happy";
    static int energy = 100;


    //let the user create their character
    public static void createCharacter() {
        ConsoleOperatos.displayText("You can now create your own Tamagotchi");
        int userDecision;

        do{
            System.out.println("You have to make some decision now: " + "\nDo you want to create a: \n1. Cat  \n2. Dog");
            try {
                userDecision = Integer.parseInt(scanner.next());

            }catch (Exception e) {
                System.out.println("You have to enter 1 or 2");
                userDecision = 0;
            }
        } while (userDecision < 1 || userDecision > 2);

        if(userDecision == 1) {

            System.out.println("You want to create a cat");
            ConsoleOperatos.clearConsole();
            System.out.println("Enter your cats name");
            String name = scanner.next();
            System.out.println("Enter the race you wish your cat");
            String race = scanner.next();
            ConsoleOperatos.printSeperator(30);
            System.out.println("Your cats attributes: " + "\nName: " + name + "\nRace: " + race + "\nMood: " + mood + "\nEnergy: " + energy);
            ConsoleOperatos.printSeperator(30);

            TamagotchiCharacters character = characters.makeCharacter(name, race, age, mood, energy);
            System.out.println("Your Cat has been created: " + character.getName());
            ConsoleOperatos.printSeperator(30);


        }

        if(userDecision == 2) {
            System.out.println("You want to create a dog");
            ConsoleOperatos.clearConsole();
            System.out.println("Enter your dogs name");
            String name = scanner.next();
            System.out.println("Enter the race you wish your dog");
            String race = scanner.next();
            ConsoleOperatos.printSeperator(30);
            System.out.println("Your dogs attributes: " + "\nName: " + name + "\nRace: " + race + "\nMood: " + mood + "\nEnergy: " + energy);
            ConsoleOperatos.printSeperator(30);

            TamagotchiCharacters character = characters.makeCharacter(name, race, age, mood, energy);
            System.out.println("Your Dog has been created: " + character.getName());
            ConsoleOperatos.printSeperator(30);
        }

    }



}
