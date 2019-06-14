//Import the scanner utility to receive user input
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //Allows users to provide keyboard input
        Scanner keyboard = new Scanner(System.in);
        //Prompt user to submit a number & test if prime
        System.out.println("Please input a number to see if it's prime");
        //Declare variables
        int inputNum = keyboard.nextInt(), x, y = inputNum/2;
        //Declare boolean; true = prime, false = not prime
        boolean prime = false;
        //Prime numbers must be =< 1
        if (inputNum <= 1){
            System.out.println(inputNum + " is not a prime number");
        }
        else {
            /*Loop tests if inputNum prime by checking if it's
            divisible by any number from 2 to half of inputNum's
            value. We only have to check up to half of inputNum
            because no number is divisible by more than it's half*/
            for (x=2; x<=y; x++) {
                if (inputNum % x == 0) {
                    prime = false;
                    break;
                }
            }
            if (false)
                System.out.println(inputNum + " is not a prime number");
            else
                System.out.println(inputNum + " is a prime number");
        }

    }
}
