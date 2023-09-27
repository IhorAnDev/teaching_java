package comporator_comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("frog");
        animals.add("doger");
        animals.add("cat");
        animals.sort((o1, o2) -> o2.length() - o1.length());
        System.out.println(animals);

    }
}

class sortByLength implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }

    // 5, 7, 2, 3
    //
}