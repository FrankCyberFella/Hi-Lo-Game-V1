package the_application;

import the_data.myNumber;

public class ApplicationCode {
    public static void main(String[] args) {
        greeting();

        myNumber myNumber = new myNumber();

        alldone();
    }  // end of main
    private static void greeting() {
        System.out.println("Welcome to Frank's Hi-Lo Game");
        System.out.println("\nIn this game you will be asked to guess what number I am thinking of.");
        System.out.println("After your guess I will tell if you guess is too high or too low.");
        System.out.println("The game will continue until you guess the number or choose to exit.");
    }
    private static void alldone() {
        System.out.println("\nThanks for playing Frank's Hi-Lo game!");
        System.out.println("I hope you had an enjoyable experience.");
        System.out.println("Please come back and play again!");
    }
}
