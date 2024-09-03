import java.util.HashMap;

public class encryptor {
    public static void main(String[] args) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        // Lowercase letters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetMap.put(ch, ch - 'a' + 1);
        }

        // Uppercase letters
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabetMap.put(ch, (ch - 'A' + 1) * 2);
        }

        // Special characters (if needed)
        // char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '?'};
        // for (char ch : specialChars) {
        //     alphabetMap.put(ch, 1);
        // }

        // To print the map (optional)
        // System.out.println(alphabetMap);
    }
}
