package comparable;

import java.util.*;

public class ComparableDemo1 {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();


        addElements(peopleList);
        addElements(peopleSet);

        // personJohn.compareTo(personBob) = -1 ;
        // personJohn.compareTo(personMike) = 1 ;
        // personJohn.compareTo(personMariya) = 0;
        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);

    }

    private static void addElements(Collection collection) {
        collection.add(new Person(3, "Migel"));
        collection.add(new Person(4, "Mariya"));
        collection.add(new Person(1, "John"));
        collection.add(new Person(2, "Bob"));
    }
}

class Person implements Comparable<Person> {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getName().length() > o.getName().length()) {
            return 1;
        } else if (this.getName().length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}