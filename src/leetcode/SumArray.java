package leetcode;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] newArr = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sum(newArr)));
    }

    public static int[] sum(int[] arr) {
        int sum = 0;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result[i] = sum;
        }
        return result;
    }
}
