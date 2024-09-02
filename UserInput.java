import java.util.Scanner; //import statement for scanner; scanner is required to get users text
import java.util.Random;

public class UserInput {
    void getText() {
        Scanner scan = new Scanner(System.in); // creating the scanner as a variable
        System.out.print("Enter your text: ");
        String inputText = scan.next(); // scans next line entered by user
        // and assigns it to variable inputText
        System.out.println(inputText);
    }

    StringBuilder keyGenerator() {
        Random random = new Random();

        int keyLength = random.nextInt(15, 26);
        StringBuilder key = new StringBuilder();
        for(int i = 0; i < keyLength; i++) {

            int randomIndex = random.nextInt(26);
            char randomChar = (char) ('A' + randomIndex);
            key.append(randomChar);
        }

        return key;
    }
}