package lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaEx2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list1 = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hey");
        map.put(2, "Yes");



        fillArr(arr);
        fillList(list1);

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(Arrays.toString(arr));

        int reduce = list1.stream().reduce(10, (acc, el) -> acc += el);

        int sum = Arrays.stream(arr).reduce((acc, el) -> acc += el).getAsInt();

        System.out.println(reduce);
        System.out.println(sum);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }


    private static void fillArr(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }

}
