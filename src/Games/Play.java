package Games;

import Pets.TamagotchiCharacters;
import UI.ConsoleOperatos;

import java.util.Random;

//Creating a class so the user has the opportunity to play with their pet, If the pet is low on energy the pet will go to sleep instead.
public class Play {

     //Initialize the Tamagotchi object to the class
    static TamagotchiCharacters c1 = new TamagotchiCharacters(TamagotchiCharacters.getName(), TamagotchiCharacters.getRace(), TamagotchiCharacters.getAge(), TamagotchiCharacters.getMood(), TamagotchiCharacters.getEnergy());
    static Random rd = new Random();

    //Creating a method for the pet to be played with
    public static void playWithPet() {

        int randomEnergy = rd.nextInt(99);
        c1.setEnergy(randomEnergy);

        if(TamagotchiCharacters.getEnergy() >= 100) {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            System.out.println(TamagotchiCharacters.getName() + " Is really ready to play");
            ConsoleOperatos.printSeperator(30);

        } 
        
        else if(TamagotchiCharacters.getEnergy() < 100 && TamagotchiCharacters.getEnergy() > 50) {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            ConsoleOperatos.printSeperator(30);
            System.out.println(TamagotchiCharacters.getName() + " is a little tired but ready to play");
            ConsoleOperatos.printSeperator(30);
            c1.setEnergy(randomEnergy);


            System.out.println("New energy: " + TamagotchiCharacters.getEnergy());
            ConsoleOperatos.printSeperator(30);

        }
        else {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            c1.setEnergy(randomEnergy);
            ConsoleOperatos.printSeperator(30);
            System.out.println(TamagotchiCharacters.getName() + " Is very tired and would like to sleep instead");
            Sleep.getSleep();
            System.out.println(TamagotchiCharacters.getName() + " has gotten some sleep");
            ConsoleOperatos.printSeperator(30);

        }


    }
}
