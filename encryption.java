
import java.util.Scanner;

public class encryption {
    void getText() {
        Scanner scan = new Scanner(System.in); // creating the scanner as a variable
        System.out.print("Enter your text: ");
        String inputText = scan.next(); // scans next line entered by user
        // and assigns it to variable inputText
        System.out.println(inputText);
    }

}
