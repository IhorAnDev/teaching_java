package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
    public static void main(String[] args) {

        List<Child> children = new ArrayList<>();
        processElements(children);
        Child child = children.get(0);
        child.childSpecificMethod();
//        processParentElement(children);

        List<Parent> parents = new ArrayList<>();
        List<Child> children2 = new ArrayList<>();
        processElements2(parents);
        processElements2(children2);

        List<GrandChild> grandChildren = new ArrayList<>();
//        processElements2(grandChildren);

        Child child2 = children.get(0);
        child2.childSpecificMethod();
    }

    private static void processElements2(List<? super Child> elements) {
        Object element = elements.get(0);
        Parent parentElement = (Parent) elements.get(0);
        GrandChild grandChild = (GrandChild) elements.get(0);

        elements.add(new Child());
        elements.add(new GrandChild());
        elements.add(null);

//        elements.add(new Parent());
//        elements.add(new Object());
    }

    public static void processParentElement(List<Parent> parents) {
    }

    public static void processElements(List<? extends Parent> elements) {
        Parent parent = elements.get(0);
        Child child = (Child) elements.get(0);


//        elements.add(new Parent());
//        elements.add(new Child());
//        elements.add(new GrandChild());

        elements.add(null);
    }
}

class Parent {

}

class Child extends Parent {
    public void childSpecificMethod() {

    }
}

class GrandChild extends Child {
}