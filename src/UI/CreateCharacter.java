package UI;
import Pets.*;

import java.util.Scanner;
//This class has been made for the user to create his own character

public class CreateCharacter {

    //A static scanner so we dont need to intialize it in every method
    static Scanner scanner = new Scanner(System.in);


    //let the user create their character
    public static void createCharacter() {
        ConsoleOperatos.displayText("You can now create your own Tamagotchi");
        int userDecision;

        //Do, try, catch, while statement to give the user ONLY two options
        //or it will loop endlessly until the user choose the right setting
        do{
            System.out.println("You have to make some decision now: " + "\nDo you want to create a: \n1. Cat  \n2. Dog");
            try {
                userDecision = Integer.parseInt(scanner.next());

            }catch (Exception e) {
                System.out.println("You have to enter 1 or 2");
                userDecision = 0;
            }
        } while (userDecision < 1 || userDecision > 2);


        //This statement will direct the user to a method where the user creates his dog character.
        if(userDecision == 1) {
            Cat.createCat();
            UserInterface.userDecision();
        }

        //This statement will direct the user to a method where the user creates his dog character.
        if(userDecision == 2) {
            Dog.createDog();
            UserInterface.userDecision();
        }

    }
}
