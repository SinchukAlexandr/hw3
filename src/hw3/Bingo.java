package hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        String var;
        int secretNumber = 45;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a integer number between 0 and 100!");
        System.out.println("To exit the game enter exit.");
        for (; ; ) {
            System.out.println("Enter your variant of the integer number:");
            var = scanner.next();
            if (var.equalsIgnoreCase("exit")) break;
            counter++;
            int intVar = Integer.parseInt(var);
            if (intVar == secretNumber) {
                System.out.println("Y O U    W O N !!! Secret number 45");
                System.out.println("You guessed it on " + counter + " attempts.");
                break;
            } else if (intVar > secretNumber) {
                System.out.println("You enter number more of secret number.");
                System.out.println("Try again");
                System.out.println();
                continue;
            } else {
                System.out.println("You enter number less of secret number.");
                System.out.println("Try again");
                System.out.println();
            }
        }
        System.out.println("Game over.");
    }
}
