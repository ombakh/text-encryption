// Derrek and Anthony's Blowfish Script :)
// 9/3/2024

// Public Class BLOWFISH
public class Blowfish {

    // AC ~ START OF XOR FUNCTION THAT WILL COMPARE TWO STRINGS OF BINARY
    static String[] xOr(String[] lhs, String[] rhs) {
        String[] result = new String[lhs.length];

        for (int i = 0; i < lhs.length; ++i) {
            // Do xOr operaton on all individual numbers in string
            result[i] = "";
            for (int j = 0; j < lhs[i].length(); ++j) {
                // .charAt basically takes the char from whichever position j is at in the strings
                // Numero uno
                char num1 = lhs[i].charAt(j);
                // Numero dos
                char num2 = rhs[i].charAt(j);
                
                // If the characters are the same, add a 0 to the result string. If not add a 1 
                if (num1 == num2) {
                    result[i] += "0";
                }
                else {
                    result[i] += "1";
                }
            }
        }
        // This is a lot like c++, either that or I'm doing everything wrong
        return result;
    }
    
    // AC ~ MAIN FUNCTION (CHANGE IF YOU WANT IDC IT WAS JUST AN ERROR)
    public static void main(String[] args) {
        
    }
}

