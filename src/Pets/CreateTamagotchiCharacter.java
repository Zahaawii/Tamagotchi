package Pets;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CreateTamagotchiCharacter {

    static private List<TamagotchiCharacters> characters = new ArrayList<>();

    public TamagotchiCharacters makeCharacter(String name, String race, int age, String mood, int energy) {
        TamagotchiCharacters character = new TamagotchiCharacters(name, race, age, mood, energy);
        characters.add(character);
        return character;
    }

    public List<TamagotchiCharacters> getCharacters() {
        return characters;
    }

    //See if the character exist
    public TamagotchiCharacters getTamagotchiCharacters(String name) {
        for(TamagotchiCharacters tamagotchiCharacters : characters){
            if(tamagotchiCharacters.getName().equalsIgnoreCase(name)) {
                return tamagotchiCharacters;
            }
        }
        return null;
    }

    //Delete the character
    public boolean deleteCharacter(String name) {
        TamagotchiCharacters tamagotchiCharacters = getTamagotchiCharacters(name);
        if(tamagotchiCharacters != null) {
            characters.remove(tamagotchiCharacters);
            return true;
        }
        return false;
    }

}
