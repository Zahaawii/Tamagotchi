package Pets;

import UI.ConsoleOperatos;
import java.util.Scanner;

//Created a class that extends Tamagotchi class with Tamagothcis attributes.
public class Dog extends TamagotchiCharacters{

    public Dog(String name, String race, int age, String mood, int energy) {
        super(name, race, age, mood, energy);
    }

    //Created an Arraylist and some hardcoded attrbitue when you start creating your pet.
    static private CreateTamagotchiCharacter characters = new CreateTamagotchiCharacter();
    static Scanner scanner = new Scanner(System.in);
    static int age = 0;
    static String mood = "Happy";
    static int energy = 100;

     //Gives the user the opportunity to create a cat. The attributes will be stored in the ArrayList and in the object.
    public static void createDog() {
        System.out.println("You want to create a dog");
        ConsoleOperatos.clearConsole();
        ConsoleOperatos.dogDrawing();
        System.out.println("Enter your dogs name");
        String name = scanner.next();
        System.out.println("Enter the race you wish your dog");
        String race = scanner.next();
        ConsoleOperatos.printSeperator(30);
        System.out.println("Your dogs attributes: " + "\nName: " + name + "\nRace: " + race + "\nMood: " + mood + "\nEnergy: " + energy);
        ConsoleOperatos.printSeperator(30);

        TamagotchiCharacters character = characters.makeCharacter(name, race, age, mood, energy);
        System.out.println("Your Dog has been created: " + character.getName());
        ConsoleOperatos.displayText("You will be directed to the main menu again");
    }
}
