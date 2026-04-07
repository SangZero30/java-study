package study20260407;

public class Alphabet {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            } else {
                answer += Character.toUpperCase(ch);
            }
        }
        System.out.println(answer);

    }
}
