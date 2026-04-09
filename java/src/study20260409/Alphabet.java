package study20260409;

public class Alphabet {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += String.valueOf(Character.toLowerCase(ch));
            } else {
                result += String.valueOf(Character.toUpperCase(ch));
            }
        }
        System.out.println(result);
    }
}
