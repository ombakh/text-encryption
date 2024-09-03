import java.util.Scanner;
import java.util.HashMap;

    public class Vigenere {
        char[][] encryptArray = new char[2][35];

        public static void main(String[] args) {
            Vigenere vigenere = new Vigenere();
            vigenere.arrayFiller(); //fill the array with user input and key
            vigenere.printArray(vigenere.encryptArray); //print the filled array (debugging purposes)
            //vigenere.applyVigenereCipher(); //apply Vigenere cipher
        }

        public void arrayFiller() {
            Scanner scanner = new Scanner(System.in);
            UserInput userInput = new UserInput();

            String text = userInput.getText();  //get user input text
            StringBuilder key = userInput.keyGenerator(text);  //generate key based on user input text

            for(int i = 0; i < 35; i++){
                if(i  < text.length()){
                    encryptArray[0][i] = text.charAt(i);    //fill first row with user input text
                } else {
                    encryptArray[0][i] =' ';  //fill remaining spaces with space character
                }
            }

            for(int i = 0; i  < 35; i++){
                if(i < key.length()){
                    encryptArray[1][i] = key.charAt(i);    //fill second row with key
                } else {
                    encryptArray[1][i] = ' '; //fill remaining spaces with space character
                }
            }
        }

        public void printArray(char[][] encryptArray){
            for(int i = 0; i<encryptArray.length; i++){
                for(int j = 0; j < encryptArray[i].length; j++){
                    System.out.print(encryptArray[i][j] + " "); //print array elements for debugging purposes
                }
                System.out.println();
            }
        }
    }

        // public void applyVigenereCipher(){
        //     alphabetMap = new HashMap<>();

