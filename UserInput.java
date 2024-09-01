import java.util.Scanner; //import statement for scanner; scanner is required to get users text

public class UserInput {
    void getText() {
        Scanner scan = new Scanner(System.in); // creating the scanner as a variable
        System.out.print("Enter your text: ");
        String inputText = scan.next(); // scans next line entered by user
        // and assigns it to variable inputText
        System.out.println(inputText);
    }

    void getKey() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your key?: ");
        String key = scan.next();
    }
}