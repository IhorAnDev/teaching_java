package comparable;


import java.util.*;

public class ComparableDemo1 {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElement(peopleList);
        addElement(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElement (Collection collection){
        collection.add(new Person(3, "Migel"));
        collection.add(new Person(2, "Anna"));
        collection.add(new Person(4, "Li"));
        collection.add(new Person(1, "Johnathon"));
    }
}

class Person implements Comparable<Person> {

    private int id;

    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}