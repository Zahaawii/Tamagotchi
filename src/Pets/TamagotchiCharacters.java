package Pets;

public class TamagotchiCharacters {

    private static String name;
    private static String race;
    private static int age;
    private static String mood;
    private static int energy;

    public TamagotchiCharacters(String name, String race, int age, String mood, int energy){
        TamagotchiCharacters.name = name;
        TamagotchiCharacters.race = race;
        TamagotchiCharacters.age = age;
        TamagotchiCharacters.mood = mood;
        TamagotchiCharacters.energy = energy;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        TamagotchiCharacters.name = name;
    }

    public static String getRace() {
        return race;
    }

    public void setRace(String race) {
        TamagotchiCharacters.race = race;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age){
        TamagotchiCharacters.age = age;
    }

    public static String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        TamagotchiCharacters.mood = mood;
    }

    public static int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        TamagotchiCharacters.energy = energy;
    }

}
