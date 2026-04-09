package study20260408;
/*
영어로 표기되어있는 숫자를
수로 바꿔야 함
아니 바꾸는게 replace 였찌 ,,,,으아아아아아ㅏ 시방

 */
public class EnglishHate {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long result = 0;
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < words.length; i++) {
            numbers =  numbers.replace(words[i], String.valueOf(i));
        }
        result = Long.valueOf(numbers);
        System.out.println(result);
    }
}
