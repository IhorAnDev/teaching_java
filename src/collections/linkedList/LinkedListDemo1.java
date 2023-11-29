package collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

//        measureTime(linkedList);
//        measureTime(arrayList);
        System.out.println("======================");
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        System.out.println(arrayList1);
        arrayList1.add(0, 0);
        System.out.println(arrayList1);
    }

    public static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
