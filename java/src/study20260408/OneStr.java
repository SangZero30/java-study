package study20260408;

import java.util.Arrays;

/*
문자열  s 가 주어집니다 .
s에서 한번만 등장하는 문자를 사전순으로 정렬한 문자열로 리턴
Sting[] 배열로 쪼개 고

!= 일때만 추가+



 */
public class OneStr {
    public static void main(String[] args) {
        String s = " ";
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                answer += ch;
            }
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);

        System.out.println(answer);
    }
}
