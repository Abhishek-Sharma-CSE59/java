import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int score =0;
        final int total_questions= 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Computer quiz");
        System.out.print("Do you want to play? : ");
        String playing = scanner.nextLine().trim();
        if(playing.equalsIgnoreCase("yes")){
            String questions[] ={
                "What does CPU stands for?",
                "What does GPU stands for?",
                "What does RAM stands for?",
                "What does PSU stands for?"
            };
            String answers[]={
                "computer processing unit",
                "graphics processing unit",
                "random acess memory",
                "power supply unit"
            };
            
            String answer = "";
            for(int i = 0; i<4;i++){
                System.out.print(questions[i]);
                answer = scanner.nextLine();
                if(answer.equalsIgnoreCase(answers[i])){
                    System.out.println("correct answer");
                    score++;
                }
                else{
                    System.out.println("Incorrect answer");
                }
            }
        }
        System.out.println(score);
        double percentage  = (score/(double)total_questions)*100;
        System.out.println("You gave " + score + " correct answers");
        System.out.println("you scored " + percentage + "%");
    }
}
