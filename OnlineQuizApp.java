import java.util.*;

// class to represent each question
class Question {
    String questionText;
    List<String> options;
    int correctOption;

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

// main class
public class OnlineQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List to hold all questions
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
                "1. What are Java loops?",
                Arrays.asList("A. Conditional statements", "B. Iteration statements", "C. Exception handlers", "D. Data types"),
                2
        ));

        questions.add(new Question(
                "2. What is an enhanced for-loop?",
                Arrays.asList("A. Used for arrays and collections", "B. Used only for if-else", "C. Used for strings only", "D. None of these"),
                1
        ));

        questions.add(new Question(
                "3. How do you handle multiple user inputs in Java?",
                Arrays.asList("A. Using Scanner", "B. Using BufferedReader", "C. Using loops", "D. All of the above"),
                4
        ));

        questions.add(new Question(
                "4. How is switch-case different from if-else?",
                Arrays.asList("A. Switch is faster and cleaner", "B. Switch can handle complex conditions", "C. If-else is always better", "D. Both are same"),
                1
        ));

        questions.add(new Question(
                "5. What are Collections in Java?",
                Arrays.asList("A. Framework for data storage", "B. Group of interfaces and classes", "C. Supports Lists, Sets, Maps", "D. All of the above"),
                4
        ));

        // Shuffle questions for randomness
        Collections.shuffle(questions);

        int score = 0;
        System.out.println("🎯 Welcome to the Java Online Quiz!");
        System.out.println("----------------------------------");

        for (Question q : questions) {
            System.out.println("\n" + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == q.correctOption) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctOption);
            }
        }

        System.out.println("\n----------------------------------");
        System.out.println("🎓 Quiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.size());

        // feedback statements
        if (score == questions.size()) {
            System.out.println("🏆 Excellent! Perfect score!");
        } else if (score >= questions.size() / 2) {
            System.out.println("👍 Good job! Keep practicing.");
        } else {
            System.out.println("📖 Try again to improve your Java basics.");
        }

        sc.close();
    }
}
