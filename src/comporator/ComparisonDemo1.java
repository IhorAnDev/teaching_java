package comporator;

import java.util.*;

public class ComparisonDemo1 {
    public static void main(String[] args) {
/*        List<String> names = new ArrayList<>();
        names.add("John"); // 4
        names.add("Bob"); // 3
        names.add("Mike"); // 4
        names.add("Mariya"); // 6
        System.out.println("before sort: " + names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("after sort: " + names);
        System.out.println("======================");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(300);
        numbers.add(1);
        numbers.add(40);
        numbers.add(2);
        System.out.println("before sort: " + numbers);
        numbers.sort((o1, o2) -> o2 - o1);
        System.out.println("after sort: " + numbers);*/
        System.out.println("======================");
        Person p1 = new Person(1, "John");
        Person p2 = new Person(2, "Bob");
        Person p3 = new Person(3, "Mike");
        Person p4 = new Person(4, "Mariya");
        List<Person> persons = new ArrayList<>();
        persons.add(p2);
        persons.add(p4);
        persons.add(p1);
        persons.add(p3);
        System.out.println("before sort: " + persons);
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.length() - o2.name.length();
            }
        });
        System.out.println("after sort: " + persons);

    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class BackwardInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

 class Person implements Comparable<Person> {
    public int id;
    public String name;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return o.id - this.id;
    }
}

class PersonCompareById implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.id - o2.id;
    }
}