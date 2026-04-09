package study20260409;

import java.util.Arrays;

/*
정수 배열 array 와 정수 n 이 매개변수로 주어질 떄
array 들어있는 정수 중 n 과 가장 가까운 수
arr - a  해서 가장 숫자가 작으면 그게 답인데;
a  가 더크면 b 를 a 로 넣는게 맞지
 */
public class CloserNumber {
    public static void main(String[] args) {
        int[] arr = {3, 10, 28};
        Arrays.sort(arr);
        int n = 15;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[0] - n) > Math.abs(arr[i] - n)) {
                arr[0] = arr[i];
            }
        }
        System.out.println(arr[0]);
    }
}
