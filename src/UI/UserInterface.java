package UI;

import java.util.Scanner;

//This class has been made to make an userinterface for the user.
public class UserInterface {

    static Scanner scanner = new Scanner(System.in);

    //Gives the user a pretty overlay to start the game and decide what to do.
    public static void welcomeMenu () {
        ConsoleOperatos.displayText("Welcome to your Tamagotchi world");
        ConsoleOperatos.catDrawing();
        userDecision();
    }

    //The backend code to take the user decision and forward the user to another state ind the game.
    public static void userDecision() {
        ConsoleOperatos.pressToContiune();
        int userGameChoice;

        //Do, try, catch, while loop has been made to let the user only enter 1 or 2, if the user fails it will loop
        do {
            ConsoleOperatos.displayText("You have following choices: " + "\nPress 1 if you want to create a Tamagotchi" +
                    "\nPress 2 if you want to continue to the game");

            try {
                userGameChoice = Integer.parseInt(scanner.next());

            } catch (Exception e) {
                System.out.println("Press 1 or 2 to continue");
                userGameChoice = 0;
            }
        } while (userGameChoice < 1 || userGameChoice > 2);


        //User has the opportunity to create his own pet
        if(userGameChoice == 1) {
            ConsoleOperatos.pressToContiune();
            CreateCharacter.createCharacter();
        }

        //when the user has created a pet the user can play with it
        if(userGameChoice == 2) {
            do {
                ConsoleOperatos.pressToContiune();
                GameInterface.welcomeGameInterface();
                GameInterface.userDecisionGame();
            } while(true);

        }
    }
}
