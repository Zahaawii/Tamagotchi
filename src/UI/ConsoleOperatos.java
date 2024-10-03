package UI;

import java.util.Scanner;

//This class has been made to 'design' our game nicely in the terminal

public class ConsoleOperatos {

    static Scanner scanner = new Scanner(System.in);

    //Instead of constantly writing println, we have a method to do that.
    public static void displayText(String prompt) {
        printSeperator(30);
        System.out.println(prompt);
        printSeperator(30);
    }

    //Method to create a printline to showcase a pretty terminal
    public static void printSeperator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }


    //To clear the terminal for all the currently text
    public static void clearConsole() {
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    //Let the user interact with the game
    public static void pressToContiune() {
        System.out.println("Press anything to continue");
        scanner.nextLine();
        clearConsole();
    }

    public static void catDrawing() {
        System.out.println(" /\\_/\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
    }

    public static void dogDrawing() {
        System.out.println("      |\\      _,,,---,,_\n" +
                "ZZZzz /,`.-'`'    -.  ;-;;,_\n" +
                "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
                "    '---''(_/--'  `-'\\_)  ");
    }
}
