package Games;

import Pets.TamagotchiCharacters;
import UI.ConsoleOperatos;

import java.util.Random;

public class Sleep {

    static TamagotchiCharacters c1 = new TamagotchiCharacters(TamagotchiCharacters.getName(), TamagotchiCharacters.getRace(), TamagotchiCharacters.getAge(), TamagotchiCharacters.getMood(), TamagotchiCharacters.getEnergy());
    static Random rd = new Random();

    public static void getSleep() {

        int randomEnergy = rd.nextInt(99);

        c1.setEnergy(randomEnergy);

        if(TamagotchiCharacters.getEnergy() >= 100) {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            System.out.println(TamagotchiCharacters.getName() + " Is not tired");
            ConsoleOperatos.printSeperator(30);

        } else if(TamagotchiCharacters.getEnergy() < 100 && TamagotchiCharacters.getEnergy() > 50) {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            ConsoleOperatos.printSeperator(30);
            System.out.println(TamagotchiCharacters.getName() + " is a little tired");
            ConsoleOperatos.printSeperator(30);
            c1.setEnergy(randomEnergy);

            System.out.println(TamagotchiCharacters.getName() + " has gotten some sleep");
            ConsoleOperatos.dogDrawing();
            System.out.println("New energy: " + TamagotchiCharacters.getEnergy());
            ConsoleOperatos.printSeperator(30);

        }
        else {
            System.out.println(TamagotchiCharacters.getName() + " energy is: " + TamagotchiCharacters.getEnergy());
            c1.setEnergy(randomEnergy);
            ConsoleOperatos.printSeperator(30);
            System.out.println(TamagotchiCharacters.getName() + " Is very tired");
            System.out.println(TamagotchiCharacters.getName() + " has gotten some sleep");
            ConsoleOperatos.dogDrawing();
            ConsoleOperatos.printSeperator(30);
            System.out.println("New energy: " + TamagotchiCharacters.getEnergy());
        }


    }
}
