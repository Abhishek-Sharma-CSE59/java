
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to this adveture game s for start!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        if(answer.equalsIgnoreCase("s")){
            System.out.println("\nYou are on a dirty road and there is a dead end , you have to win this game and survive till the end!! There are two roads, one is going right and then second is going left, which way will you go (left or right)");
            answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("right")){
                System.out.println("\nLet's go to the right and then we saw a river there is a boat at the side , whould you cross the river with the boat or go around the river to explore something (cross or go)");
                answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("cross")){
                    System.out.println("The boat was broken and has some holes under the boat you sunk and eaten by the aligator!! You lose...");
                }
                else if (answer.equalsIgnoreCase("go")) {
                    System.out.println("You tried to go side by side of the river ,walked miles and starved to death!! You Lose");
                    
                }
                else{
                    System.out.println("You entered the wrong value YOU lose!! try to enter correct value!!");
                }
            }else if(answer.equalsIgnoreCase("left")){
                System.out.println("\nLet's go to the left and then you saw a bridge will you cross it or go back (cross or back)");
                answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("cross")){
                    System.out.println("You saw a person , will you talk to him or pass by (talk or pass)");
                    answer = scanner.nextLine();
                    if(answer.equalsIgnoreCase("talk")){
                        System.out.println("You talked to the person and he gave you the map to home and YOU WON!!");
                    }else if(answer.equalsIgnoreCase("pass")){
                        System.out.println("The person got offend you Lose!!");
                    }
                    else{
                        System.out.println("You entered the wrong value YOU lose!! try to enter correct value!!");
                    }
                }
                else{
                    System.out.println("You entered the wrong value YOU lose!! try to enter correct value!!");
                }
            }
            

        }
        else{
            System.out.println("You pressed the wrong key!! Try again");
        }
    System.out.println("Thank you for playing!!");
    }    
}
