import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class UserInput {

    String getText() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String inputText = scan.nextLine(); // Use nextLine to capture the entire input
        return inputText;
    }

    StringBuilder keyGenerator(String inputText) {
        Random random = new Random();

        int keyLength = inputText.length(); // Get the length of inputText
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < keyLength; i++) {

            int randomIndex = random.nextInt(26);
            char randomChar = (char) ('A' + randomIndex);
            if (random.nextBoolean()) {
                randomChar = Character.toLowerCase(randomChar);
            }

            key.append(randomChar);
        }

        return key;
    }

    StringBuilder encryptText(String inputText) {
        HashMap<Character, Integer> alphabetMap = Encryptor.getAlphabetMap();
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : inputText.toCharArray()) {
            if (alphabetMap.containsKey(ch)) {
                encryptedText.append(alphabetMap.get(ch)).append(" ");
            } else {
                encryptedText.append(ch).append(" ");
            }
        }

        return encryptedText;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String text = userInput.getText(); // Get the user's input text
        StringBuilder generatedKey = userInput.keyGenerator(text); // Generate a key

        StringBuilder encryptedText = userInput.encryptText(text); // Encrypt the input text
        System.out.println("Generated key: " + generatedKey);
        System.out.println("Encrypted text: " + encryptedText);
    }
}
