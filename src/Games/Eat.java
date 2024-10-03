package Games;

import Pets.TamagotchiCharacters;
import java.util.Random;

//Class has been made to get the user the opportuinity to let their pet eat.
public class Eat {

    //Initialize the Tamagotchi object to the class
    static TamagotchiCharacters c1 = new TamagotchiCharacters(TamagotchiCharacters.getName(), TamagotchiCharacters.getRace(), TamagotchiCharacters.getAge(), TamagotchiCharacters.getMood(), TamagotchiCharacters.getEnergy());
    static Random rd = new Random();

    //Creating a method to make the pet eat
    public static void eatFood() {

        int randomEnergy = rd.nextInt(99);
        c1.setEnergy(randomEnergy);

        if(TamagotchiCharacters.getEnergy() >= 100) {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            System.out.println(TamagotchiCharacters.getName() + " Is not hungry");

        } else if(TamagotchiCharacters.getEnergy() < 100 && TamagotchiCharacters.getEnergy() > 50) {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            System.out.println(TamagotchiCharacters.getName() + " Could eat some food");
            c1.setEnergy(randomEnergy);

            System.out.println(TamagotchiCharacters.getName() + " has gotten some food");
            System.out.println("New energy: " + TamagotchiCharacters.getEnergy());

        }
        else {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            c1.setEnergy(randomEnergy);
            System.out.println(TamagotchiCharacters.getName() + " Is very hungry");
            System.out.println(TamagotchiCharacters.getName() + " has gotten some food");
            System.out.println("New energy: " + TamagotchiCharacters.getEnergy());
        }


    }
}
