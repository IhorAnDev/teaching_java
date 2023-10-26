package collections.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(4);
        myLinkedList.add(67);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
    }
}
