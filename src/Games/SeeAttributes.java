package Games;

import Pets.CreateTamagotchiCharacter;
import Pets.TamagotchiCharacters;

public class SeeAttributes {

    static TamagotchiCharacters c1 = new TamagotchiCharacters(TamagotchiCharacters.getName(), TamagotchiCharacters.getRace(), TamagotchiCharacters.getAge(), TamagotchiCharacters.getMood(), TamagotchiCharacters.getEnergy());


    public static void seePetAttributes() {
        CreateTamagotchiCharacter.getTamagotchiCharacters(TamagotchiCharacters.getName());
    }
}
