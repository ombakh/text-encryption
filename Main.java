//import statement for scanner; scanner is required to get users text
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // creating the scanner as a variable
        System.out.println("Enter your text: ");
        String inputText = scan.nextLine(); // scans next line entered by user
                                            // and assigns it to variable inputText


    }
}
