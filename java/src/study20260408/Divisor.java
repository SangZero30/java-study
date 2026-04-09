package study20260408;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisor {
    public static void main(String[] args) {
        int n = 29;
        List<Integer> result = new ArrayList<>();
        for  (int i = 1; i <= n; i++) {
            if(n % i == 0 ){
                result.add(i);
            }
        }
        System.out.println(result);
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
