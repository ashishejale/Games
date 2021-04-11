import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int max;
    private int theNumber;
    public static Scanner scan = new Scanner(System.in);

    public GuessTheNumber(int maxInput) {
        this.max = maxInput;
        Random randomNumber = new Random();
        this.theNumber = Math.abs(randomNumber.nextInt()) % (max + 1);
    }

    public void play() { //response based on inupt
        while(true) {
            int input = scan.nextInt();
            if (input > theNumber) {
                System.out.println("Your number is too big!");
            } else if (input < theNumber) {
                System.out.println("Your number is too small!");
            } else {
                System.out.println("You got it, you Won!");
                break;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to my 'Guess the Number Game'!\n"
                + "What should be the max value for the number?");
        int inputMax = scan.nextInt(); //get the max from user

        GuessTheNumber game = new GuessTheNumber(inputMax); //create instance of class with max as input
        System.out.println("Let's start the game! Enter any number to start.");
        game.play(); //start the game
        scan.close();
    }
}
