import java.util.Scanner;
public class quizgame{

    public static void main(String[] args) {
        int score = 0;
        System.out.println("Welcome to my computer quiz");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play? :");
        String playing = scanner.nextLine(); 
        // System.out.println(playing);
        if (playing.toLowerCase().equals("yes")){
            System.out.println("Okay! Let's Plat :");
            System.out.println("What does CPU stands for? :");
            String answer = scanner.nextLine();


            if (answer.toLowerCase().equals("computer processing unit")){
                System.out.println("correct answer");
                score++;
            }
            else{
                System.out.println("Incorrect answer");
            }


            System.out.println("What does GPU stands for? :");
            answer = scanner.nextLine();


            if (answer.toLowerCase().equals("graphic driver unit")){
                System.out.println("correct answer");
                score++;
            }
            else{
                System.out.println("Incorrect answer");
            }


            System.out.println("What does RAM stands for? :");
            answer = scanner.nextLine();


            if (answer.toLowerCase().equals("random acess memory")){
                System.out.println("correct answer");
                score++;
            }
            else{
                System.out.println("Incorrect answer");
            }


            System.out.println("What does PSU stands for? :");
            answer = scanner.nextLine();


            if (answer.toLowerCase().equals("power supply unit")){
                System.out.println("correct answer");
                score++;
            }
            else{
                System.out.println("Incorrect answer");
            }

        }
        System.out.println("You got " + score + " Answers correct");
        System.out.println("You scored " + (score/4)*100 + "%");
    }
}