import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int guesses = 0;
        System.out.println("Type a number :");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int limit = 1;
        try {
            limit = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Try Entering integar next time");
            System.exit(0);
        }
        if(limit <= 0){
            System.out.println("please Enter number greater than 0");
            System.exit(0);
        }
        int comp = random.nextInt(limit);
        while (true) { 
            guesses ++;
            int user_guesses = 0;
            try {
                System.out.print("Enter your Guess :");
                user_guesses = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Try Entering integar next time");
                continue;
            }
            if (user_guesses == comp){
                System.out.println("You got Right!");
                break;
            }
            else{
                if(user_guesses < comp){
                    System.out.println("Your guess is smaller than the number!");
                }
                else if(user_guesses > comp){
                    System.out.println("Your guess is larger then the number");
                }
                continue;
            }
        }
    System.out.println("You got this in " + guesses + " attempts");
    }
}
    