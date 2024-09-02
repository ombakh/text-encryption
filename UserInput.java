import java.util.Random;
import java.util.Scanner;

public class UserInput {

    String getText() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String inputText = scan.next(); // Scans next word entered by user
        System.out.println(inputText);
        return inputText;
    }

    StringBuilder keyGenerator(String inputText) {
        Random random = new Random();

        int keyLength = inputText.length(); // Get the length of inputText
        StringBuilder key = new StringBuilder();
        for(int i = 0; i < keyLength; i++) {

            int randomIndex = random.nextInt(26);
            char randomChar = (char) ('A' + randomIndex);
            if (random.nextBoolean()) {
                randomChar = Character.toLowerCase(randomChar);
            }

            key.append(randomChar);
        }

        return key;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String text = userInput.getText(); // Get the user's input text
        StringBuilder generatedKey = userInput.keyGenerator(text); // Pass the input text to keyGenerator

        System.out.println("Generated key: " + generatedKey);
    }
}
