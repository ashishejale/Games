import java.util.Random;

public class TwoDiceTossGame {
    public static void diceToss() { //to generate numbers 0-6
        Random randomNumber = new Random();
        int result1 = Math.abs(randomNumber.nextInt()) % 7; //generate a random positive number and find its remainder when divided by 7
        int result2 = Math.abs(randomNumber.nextInt()) % 7; //generate a random positive number and find its remainder when divided by 7
        System.out.println("( " + result1 + "," + result2 + " )");
    }
    public static void main(String[] args) {
	// write your code here
        for(int i = 0; i < 5; i++) {
            diceToss();
        }
    }
}
