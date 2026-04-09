package study20260409;
/*
3 , 6, 9 게임은 1 부터 숫자를 하나씩
3 6 9 가 들어있는 숫자는 숫자 대신 3, 6 ,9 개수만큼 박수를 침
 */
public class Game369 {
    public static void main(String[] args) {
        int order = 29423;
        int answer = 0;
        String str = String.valueOf(order);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
