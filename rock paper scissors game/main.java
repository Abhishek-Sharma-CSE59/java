import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int user_wins = 0;
        String user_choice;
        String computer_choice;
        int count = 0;
        int tie = 0;
        String choices[] = {"rock", "paper", "scissors"};
        while (true) { 
            count++;
            System.out.println("Choose rock, paper or scissors and q to quit : ");
            user_choice = scanner.nextLine();
            int i = random.nextInt(0,3);
            computer_choice = choices[i];
            System.out.println(computer_choice);

            if(user_choice.equalsIgnoreCase(computer_choice)){
                System.out.println("it's a tie");
                tie++;
                
            }
            else if(user_choice.equalsIgnoreCase("q")){
                break;
            }
            else if((user_choice.equalsIgnoreCase("rock") && computer_choice.equalsIgnoreCase("scissors"))
            ||(user_choice.equalsIgnoreCase("paper") && computer_choice.equalsIgnoreCase("rock"))
            ||(user_choice.equalsIgnoreCase("scissors") && computer_choice.equalsIgnoreCase("paper")) ){
                print_result(user_choice,computer_choice);
                user_wins++;
            }
            else{
                System.out.println("Invalid move try again");
                count--;
            }
        }
        count--;
        System.out.println("You won : " + user_wins+"\nOut of : " + count +  "\n Ties : " + tie);
    }
    public static void print_result(String win , String loose){
        System.out.println( win + " wins " + loose + " looses ");
    
    
    
    
    }
    
    
}
