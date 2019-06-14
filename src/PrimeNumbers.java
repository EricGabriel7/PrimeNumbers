//Import the scanner utility to receive user input
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        //Allows users to provide keyboard input
        Scanner keyboard = new Scanner(System.in);
        //Prompt user to submit a number & test if prime
        System.out.println("Please input a number to see if it's prime");
        //Declare variables
        int inputNum = keyboard.nextInt();
        int x = 2;
        int y = inputNum / 2;
        int remainder = inputNum % x;

        //Declare boolean; true = prime, false = not prime
        //boolean prime = false;
        //Prime numbers must be =< 1
        if (inputNum <= 1) {
            System.out.println(inputNum + " is not a prime number");
        } else {/*Loop tests if inputNum prime by checking if it's
            divisible by any number from 2 to half of inputNum's
            value. We only have to check up to half of inputNum
            because no number is divisible by more than it's half*/
            for (x = 2; x <= y; x++) {
                /*while (inputNum%x == 0) {*/
                if (remainder > 0 && x <= y) {
                    System.out.println(inputNum + " % " + x + " = " + (inputNum % x));
                    }
                else if (remainder > 0) {System.out.println(inputNum + " is a prime number");
                    //break;
                }
                else if (remainder == 0) {
                    System.out.println(inputNum + " is not a prime number");
                    break;
                }

            }
            //
            //if (prime == false)
            //{System.out.println(inputNum + " is not a prime number");}
            //else
            //{System.out.println(inputNum + " is a prime number");}
            /*System.out.println("Want to enter another number? Y/N");
            String answer = keyboard.next();
            if (answer.equalsIgnoreCase("Y")){

        }*/

        }


    }
}