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
            alphabetMap.put(ch, (ch - 'A' + 1) * 2);
        }

        // Special characters (if needed)
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '?'};
        for (char ch : specialChars) {
            alphabetMap.put(ch, 1);
        }
    }

    public static HashMap<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }

    public static void main(String[] args) {
        System.out.println("Encryptor is ready.");
    }
}
