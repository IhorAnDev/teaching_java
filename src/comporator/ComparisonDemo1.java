package comporator;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bob");
        names.add("Migel");
        names.add("Mariya");
        System.out.println("before sort: " + names);
        names.sort(new CompareStringByLength());
        System.out.println("after sort: " + names);

        System.out.println("----------------------");

        Person p3 = new Person(3, "Migel");
        Person p4 = new Person(4, "Mariya");
        Person p1 = new Person(1, "John");
        Person p2 = new Person(2, "Bob");
        List<Person> people = new ArrayList<>();
        people.add(p2);
        people.add(p4);
        people.add(p1);
        people.add(p3);
        System.out.println("before sort: " + people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.id - o2.id;
            }
        });
        System.out.println("after sort: " + people);
    }
}


class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class CompareStringByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}