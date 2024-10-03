package UI;
import Games.Eat;
import Games.Play;
import Games.SeeAttributes;
import Games.Sleep;
import Pets.TamagotchiCharacters;
import java.util.Scanner;

public class GameInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void welcomeGameInterface() {
        ConsoleOperatos.displayText("Welcome to your Tamagotchi world: " + TamagotchiCharacters.getName());
        System.out.println("You can see your pet, feed, play or let: " + TamagotchiCharacters.getName() + " sleep");
        System.out.println("Press 1: See stats \nPress 2 Feed " +
                "\nPress 3 Play \nPress 4 Sleep");
    }

    public static void userDecisionGame() {
        int userDecision;

        do {
            try {
                userDecision = Integer.parseInt(scanner.next());
            }catch (Exception e) {
                System.out.println("You have to enter 1 to 4");
                userDecision = 0;
            }
        } while (userDecision <= 0 || userDecision > 4);

        switch(userDecision) {
            case 1:
                SeeAttributes.seePetAttributes();
                break;
            case 2:
                Eat.eatFood();
                break;
            case 3:
                Play.playWithPet();
                break;
            case 4:
                Sleep.getSleep();
                break;
        }
    }
}
