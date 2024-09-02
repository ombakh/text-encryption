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

    String keyGenerator() {
        Random random = new Random();
        int keyLength = random.nextInt(10, 26);
        int randomIndex = random.nextInt(26);
        char randomChar = (char) ('A' + randomIndex);
        String key;


        return null;
    }
}