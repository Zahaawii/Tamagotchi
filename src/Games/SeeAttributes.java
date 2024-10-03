package Games;

import Pets.CreateTamagotchiCharacter;
import Pets.TamagotchiCharacters;

//Created a class for the user to see his pets attributes, name,race, ace, mood and energy
public class SeeAttributes {

        //Initialize the Tamagotchi object to the class

    static TamagotchiCharacters c1 = new TamagotchiCharacters(TamagotchiCharacters.getName(), TamagotchiCharacters.getRace(), TamagotchiCharacters.getAge(), TamagotchiCharacters.getMood(), TamagotchiCharacters.getEnergy());


    //Made a for-each loop to showcase all attributes if the name is not null. See the foreach under Pets.
    public static void seePetAttributes() {
        CreateTamagotchiCharacter.getTamagotchiCharacters(TamagotchiCharacters.getName());
    }
}
