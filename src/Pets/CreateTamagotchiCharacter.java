package Pets;
import java.util.List;
import java.util.ArrayList;

//Created a class to take the attributes and place them in an Arraylist.

public class CreateTamagotchiCharacter {

    //Initializing the arrayList
    static private List<TamagotchiCharacters> characters = new ArrayList<>();

    //Create an Arraylist method to take the Attributes and store them in the Array.
    public TamagotchiCharacters makeCharacter(String name, String race, int age, String mood, int energy) {
        TamagotchiCharacters character = new TamagotchiCharacters(name, race, age, mood, energy);
        characters.add(character);
        return character;
    }

    //Create a method to showcase the characters
    public List<TamagotchiCharacters> getCharacters() {
        return characters;
    }

    //See if the character exist
    public static TamagotchiCharacters getTamagotchiCharacters(String name) {
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
