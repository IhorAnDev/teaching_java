package collections.linked_hash_map;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Person, Integer> personMap = new HashMap<>();
        Person first = new Person(1, "Ivan");
        Person second = new Person(1, "Ivan");
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        Set<Integer> integers = new TreeSet<>();
        integers.add(2);
        integers.add(7);
        integers.add(3);
        System.out.println(integers);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}