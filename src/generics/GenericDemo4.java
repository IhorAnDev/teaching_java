package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericDemo4 {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();

//        processParentElements(children);
        processElements(children);

        Child child = children.get(0);
        child.childSpecificMethod();

        List<Parent> parents = new ArrayList<>();
        List<Child> children2 = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        processElements2(parents);
        processElements2(children2);
        processElements2(objects);

        List<GrandChild> grandChildren = new ArrayList<>();
//        processElements2(grandChildren);

        Child child2 = children.get(0);
        child2.childSpecificMethod();


    }

    private static void processElements2(List<? super Child> elements) {
        Object element = elements.get(0);
//        Child parentElement =  elements.get(0);

        elements.add(new Child());
        elements.add(new GrandChild());
        elements.add(null);

//        elements.add(new Parent());
//        elements.add(new Object());
    }

    public static void processParentElements(List<Parent> parents) {
    }

    public static void processElements(List<? extends Parent> elements) {
        Parent parent = elements.get(0);
//        Child child = elements.get(0);

//        elements.add(new Parent());
//        elements.add(new Child());
//        elements.add(new GrandChild());

        elements.add(null);
    }
}

class Parent {
}

class Child extends Parent {

    int age;
    String name;

    public void childSpecificMethod() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        if (age != child.age) return false;
        return Objects.equals(name, child.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

class GrandChild extends Child {
}