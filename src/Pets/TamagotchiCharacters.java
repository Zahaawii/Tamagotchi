package Pets;

public class TamagotchiCharacters {

    String name;
    String race;
    int age;
    String mood;
    int energy;

    public TamagotchiCharacters(String name, String race, int age, String mood, int energy){
        this.name = name;
        this.race = race;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
