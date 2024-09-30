import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Test {
    String[] questions = {
            "What is Java?",
            "What is the function of a constructor in Java?",
            "Which tools support the software development process?",
            "What is the function of a java compiler?",
            "WHich components does a Java application need to have?"
    };

    String[][] options = {
            {"1. A type of coffee", "2. A programming language", "3. a game", "4. A person"},
            {"1. Initializes a class", "2. creates an object", "3. creates a method", "4. Its a code compiler"},
            {"1. API", "2. JVM", "3. IDE", "4. JDK"},
            {"1. It converts bytecodes to java", "2.It examins bytecodes", "3. It translates java to bytecodes", "4. it doesnt have a function"},
            {"1. Methods", "2. Local variables", "3. A dress", "4. Class"}

    };

    int[] correctAnswers = {
            2, 1, 3, 3, 4
    };

    Random randomNum = new Random();

    int correctCount = 0;
    int incorrectCount = 0;

    Scanner scanner = new Scanner(System.in);

    public void simulateQuestions(int question) {
        System.out.println(questions[question]);

        for (int i = 0; i < 4; i++) {
            System.out.println(options[question][i]);
        }

        System.out.println("enter your choice 1-4:");
        int userChoice = scanner.nextInt();

        checkAnswer(question, userChoice);
    }

    public void checkAnswer(int question, int userChoice) {
        if (userChoice == correctAnswers[question]) {
            generateMessage(true);
            correctCount++;
        }
        else {
            generateMessage(false);
            System.out.println("That was incorrect, the answer was: " + correctAnswers[question]);
            incorrectCount++;
        }
    }

    public void generateMessage(boolean correctAnswer) {
        int message = randomNum.nextInt(4);

        if (correctAnswer) {
            switch (message) {
                case 0:
                    System.out.println("Excellemt!");
                    break;
                case 1:
                    System.out.println("Good!");
                    break;
                    case 2:
                        System.out.println("Keep up the goodm work!");
                        break;
                    case 3:
                        System.out.println("nice work!");
                        break;
            }
        }
        else {
            switch (message) {
                case 0:
                    System.out.println("Please try again");
                    break;
                case 1:
                    System.out.println("Wrong choose again");
                    break;
                    case 2:
                        System.out.println("Keep trying");
                        break;
                        case 3:
                            System.out.println("dont give up");
                            break;
            }
        }
    }

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestions(i);
        }
        displayResults();
    }

    public void displayResults() {
        int totalQuestions = questions.length;
        int finalPercent = (correctCount * 100)/totalQuestions;

        System.out.println("Congrats! Test Complete!");
        System.out.println("Correct answers: " + correctCount);
        System.out.println("Incorrect answers: " + incorrectCount);
        System.out.println("Percentage: " + finalPercent);
    }

}
