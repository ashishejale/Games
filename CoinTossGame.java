import java.util.Random;

public class CoinTossGame {
    public static void coinToss() {
        Random randomNumber = new Random();
        int result = Math.abs(randomNumber.nextInt()) % 2; //genrate a random positive number and get its remainder when divided by 2
        if(result == 1) {
            System.out.println("Result: HEADS");
        } else {
            System.out.println("Result: TAILS");
        }
    }
    public static void main(String[] args) {
	// write your code here
        for(int i = 0; i < 5; i++) { //Tossing the coin 5 times
            coinToss();
        }
    }
}
