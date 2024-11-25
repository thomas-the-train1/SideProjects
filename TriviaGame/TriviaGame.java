import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Questions
        String[] questions = {
            "What is the capital of Switzerland?",
            "Who wrote the play 'Hamlet'?",
            "Which planet is known as the Red Planet?",
            "Which country produces the most coffee in the world?",
            "What does 'Hakuna Matata' mean?",
            "Which year did the Berlin Wall fall?",
            "What is the chemical symbol for water?"
        };
        // Answer choices
        String[][] choices = {
            {"A) Paris", "B) Bern", "C) Berlin", "D) Prague"},
            {"A) William Spakespeare", "B) J.K. Rowling", "C) Ernest Hemingway", "D) Mark Twain"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) Brazil", "B) United States", "C) Vietnam", "D) Indonesia"},
            {"A) Thank you", "B) Good morning", "C) Goodbye", "D) No worries"},
            {"A) 1987", "B) 1988", "C) 1989", "D) 1990"},
            {"A) H2", "B) H2O", "C) H2S", "D) CO2"}
        };
        // Answers
        String[] answers = {"B) Bern", "A) William Spakespeare", "B) Mars", "A) Brazil", 
                          "D) No worries", "C) 1989", "B) H2O"};

        int score = 0;

        System.out.println("Welcome to Trivia!");
        System.out.println("Type the letter of your choice (A, B, C, D) to answer all the questions.");
        System.out.println();

        // Game loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String choice : choices[i]) {
                System.out.println(choice);
            }

            System.out.print("Your answer: ");
            
            // Get the user's answer
            String user_answer = scan.next().toUpperCase();

            // Get the first letter of the user's actual answer
            String actual_answer = answers[i].substring(0,1).toUpperCase();

            if (user_answer.equals(actual_answer)) {
                System.out.println("That is correct!\n");
                score++;
            } else {
                System.out.println("That is incorrect! The correct answer was " + answers[i] + ".\n");
            }
        }

        // Final score
        System.out.println("Game Over! You scored " + score + " out of " + questions.length + ".");
        scan.close();
    }
}
