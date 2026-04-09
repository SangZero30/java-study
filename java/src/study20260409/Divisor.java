package study20260409;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisor {
    public static void main(String[] args) {
        int n =  24;
        List<Integer> list =  new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
