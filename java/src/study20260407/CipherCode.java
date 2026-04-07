package study20260407;

/*
cipher 에서 code 값 배수 만 골라서 반환
그러면 일단 charAt 으로 하나하나씩 꺼내고

 */

public class CipherCode {
    public static void main(String[] args) {
        String cipher = "pfqallllabwaoclk";
        String answer = "";
        int code = 2;

        for (int i = code - 1; i < cipher.length(); i+=code) {
            char ch = cipher.charAt(i);
            answer += ch;
        }
        System.out.println(answer);
    }
}
