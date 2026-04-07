package study20260407;
/*
머쓱이는 친구들과 369 게임을 하고 있습니다.
3 6 9 들어있는 개수를 세는거



 */

public class Game369 {
    public static void main(String[] args) {
        int order = 29423;
        int result  = 0;
        String strOrder = String.valueOf(order);
        for (int i = 0; i < strOrder.length(); i++) {
            char ch = strOrder.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                result++;
            }
        }
        System.out.println(result);
    }
}
