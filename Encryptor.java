import java.util.HashMap;

public class Encryptor {
    private static final HashMap<Character, Integer> alphabetMap = new HashMap<>();

    static {
        // Lowercase letters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetMap.put(ch, ch - 'a' + 1);
        }

        // Uppercase letters
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabetMap.put(ch, ch - 'A' + 27);  // Assign a different range for uppercase letters
        }

        // Special characters (if needed)
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '?'};
        int specialCharsValue = 53;  // Start assigning special characters from 28 onwards
        for (char ch : specialChars) {
            alphabetMap.put(ch, specialCharValue++);  // Special characters still map to 1
        }
        
        // Numbers (if needed)
        char[] numbers = {'0', '1', '2', '3','4', '5', '6', '7', '8', '9'};
        for(char ch : numbers){
            alphabetMap.put(ch, specialCharValue++);  // Numbers still map to 27
        }
    }

    public static HashMap<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }

    public static void main(String[] args) {
        System.out.println("Encryptor is ready.");
        System.out.println("Alphabet Map: " + getAlphabetMap());
    }
}
