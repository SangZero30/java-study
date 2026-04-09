package study20260408;

import java.util.Arrays;

/*
서로 값을 바꿔줘야 하는데,,,
 */
public class IndexChange {
    public static void main(String[] args) {
        String my_string = "hello";
        String result = "";
        String[] words = my_string.split("");
        int num1 = 1;
        int num2 = 2;
        String temp = words[num1];
        words[num1] = words[num2];
        words[num2] = temp;
        result = String.join("", words);

        System.out.println(result);
    }
}
