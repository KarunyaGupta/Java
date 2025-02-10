import java.util.Scanner;

class Question {
    private String questionText;
    private String[] answerOptions;
    private String correctAnswer;

    // Constructor to initialize the question
    public Question(String questionText, String[] answerOptions, String correctAnswer) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    // Method to display the question and answer options
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < answerOptions.length; i++) {
            System.out.println((i + 1) + ". " + answerOptions[i]);
        }
    }

    // Method to check if the user's answer is correct
    public boolean isAnswerCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}

public class QuestionAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a multiple-choice question
        String questionText = "What is the capital of France?";
        String[] answerOptions = {"Berlin", "Madrid", "Paris", "Rome"};
        String correctAnswer = "Paris";

        // Create a Question object
        Question question = new Question(questionText, answerOptions, correctAnswer);

        // Display the question
        question.displayQuestion();

        // Get the user's answer
        System.out.print("Enter your answer: ");
        String userAnswer = scanner.nextLine();

        // Check if the answer is correct
        if (question.isAnswerCorrect(userAnswer)) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer. The correct answer is: " + correctAnswer);
        }

        scanner.close();
    }
}