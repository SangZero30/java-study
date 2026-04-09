package study20260409;
/*
영어로 표기되어 있는 숫자를 수로 변환
one two thre four
 */
public class ReHateEn {
    public static void main(String[] args) {
        String number = "fivesixseveneightnine";
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        number.replace("one", "1");
        for (int i = 0; i < words.length; i++) {
            number = number.replace(words[i], String.valueOf(i));
        }
        long answer = 0;
        answer = Long.valueOf(number);
        System.out.println(answer);

    }
}
