import java.util.Scanner;
public class Vigenere {
  public static void main(String[] args){
    int[][] encryptArray = new int[2][35];

  public void arrayFiller() {
    Scanner scanner = new Scanner(System.in);
    UserInput userInput = new UserInput();
    for(int i = 0; i < 35; i++){
      encryptArray[0][i] = userInput[i];
    }
    for (int i = 0; i < 35; ++i){
      encryptArray[1][i] = key[i];
    }

  }

  public static void printArray(int[][] encryptArray){
    for(int i = 0; i<encryptArray.length; i++){
      for(int j = 0; j < encryptArray[i].length; j++){
        System.out.print(encryptArray[i][j] + " ");
      }
      System.out.println();
    }
  }
 }
}