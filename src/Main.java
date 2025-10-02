
public class Main {

     // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        if (s.length() % 2 != 0) {return false;}
        if (s.charAt(0) != '(' || s.charAt(s.length() - 1) != ')') {return false;}
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (b < 0) {return false;}
            if (s.charAt(i) == '(') {b++;} else {b--;}
        }
        return true;
    }

    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String a = String.valueOf(n);
        String str = "";
        for (int i = a.length() - 1 ; i >= 0; i--) {
            str = str + a.charAt(i);
        }
        return str;
    }


    // 3. encryptThis
    public static String encryptThis(String input) {
        String[] words = input.split(" ");
        String output = "";
        for (String word : words) {output = output + encryptWord(word) + " ";}
        return output.substring(0, output.length() - 1);
    }

    public static String encryptWord(String input) {
        int code = input.charAt(0);
        String ccode = String.valueOf(code);
        char two = input.charAt(1);
        char last = input.charAt(input.length() - 1);
        if (input.length() < 3) {return ccode + last;}
        return ccode + last + input.substring(2,input.length()-1) + two;
    }

    // 4. decipherThis
    public static String decipherThis(String input) {
        String[] words = input.split(" ");
        String output = "";
        for (String word : words) {output = output + decipherWord(word) + " ";}
        return output.substring(0, output.length() - 1);
    }

    public static String decipherWord(String input) {
        int code = Integer.parseInt(input.replaceAll("[^0-9]", ""));
        String str = input.replaceAll("[0-9]", "");
        char ccode = (char) code;
        char last = str.charAt(str.length()-1);
        char two = str.charAt(0);
        if (str.length() < 2) {return "" + ccode + last;}
        return "" + ccode + last + str.substring(1, str.length()-1) + two;
    }

}
