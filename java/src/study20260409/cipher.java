package study20260409;

public class cipher {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        String result = "";
        int code= 4;
        for (int i = code - 1; i < cipher.length(); i+= code) {
            char ch = cipher.charAt(i);
            result += String.valueOf(ch);
        }
        System.out.println(result);
    }
}
