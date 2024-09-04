// Derrek and Anthony's Blowfish Script :)
// 9/3/2024

// Public Class BLOWFISH
public class Blowfish {

    // Derrek ~ CONVERT AN ASCII STANDARD STRING TO A STRING OF HEXADECIMAL NUMBERS
    static String StrToHex(String input) {
        
        StringBuilder result =  new StringBuilder("");

        for (char ch : input.toCharArray()) {
            // Converts each character of the input string to integer
            // then convert that integer to hexadecimal and add to "result"
            result.append(Integer.toHexString((int)ch));
        }

        return result.toString();
    }

    // Derrek ~ CONVERT FROM HEXADECIMAL STRING TO BINARY STRING
    static String HexToBin(String input) {

        StringBuilder result =  new StringBuilder("");
        StringBuffer tempStr =  new StringBuffer(""); // stores 4 digits of binary at a time

        for (char ch : input.toCharArray()) {

            // Converts each character to a String first
            // then convert that Hex String to an Decimal integer
            // then convert that a Binary String
            // then add that String to "tempStr"
            tempStr.append(
                Integer.toBinaryString(
                    Integer.parseInt(
                        String.valueOf(ch), 10)));
            

            // Add leading 0s
            while (tempStr.length() < 4) {
                tempStr.insert(0, "0");
            }

            // Add the 4 binary digits to "result"
            result.append(tempStr);
            // and reset "tempStr"
            tempStr.setLength(0);

        }

        return result.toString();
    }

    // Derrek ~ CONVERT FROM BINARY STRING TO HEXADECIMAL STRING
    static String BinToHex(String input) {
        
        StringBuilder result =  new StringBuilder("");
        String tempStr = "";

        // takes 4 digits at a time and make it hexadecimal, adds it to "result"
        for (int i = 0; i < input.length(); i = i + 4) {
            tempStr = input.substring(i, i + 4);
            result.append(Integer.toHexString(Integer.parseInt(tempStr)));
            tempStr = "";
        }

        return result.toString();
    }


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

