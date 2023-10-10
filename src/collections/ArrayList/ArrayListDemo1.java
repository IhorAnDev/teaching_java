package collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(1000);
        List<Integer> integers = new ArrayList<>(arrayList);
        List<String> strings = new ArrayList<>();

        strings.add("Hey");
        strings.add("Hello");
        strings.add("Ok");

        String[] strings1 = strings.toArray(new String[0]);




        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);


        if (integers.isEmpty()) {
            integers.add(88);
        }
        arrayList.addAll(integers);

//        System.out.println(arrayList.get(2));

        arrayList.forEach((System.out::println));

    }
}
