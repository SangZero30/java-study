package study20260409;
/*
s 매개변수 주어
s 에서 한 번만 등장하ㅡㄴ 문자를 사전 순으로 정렬
반복문을 하면서 s 에 있는 값을 확인해서 중복이면 제거
String에서 indexOf 값을 확인하면
 */

import java.util.Arrays;

public class ReOneStr {
    public static void main(String[] args) {
        String s = "abdc";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                result += String.valueOf(ch);
            }
        }
        char[] alphabet = result.toCharArray();
        Arrays.sort(alphabet);
        result = String.valueOf(alphabet);
        System.out.println(result   );
    }
}
