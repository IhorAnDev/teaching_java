package generics;


public class GenericDemo1 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three"};


        printArrayAnyTypes(strings);

        System.out.println("*************");

        Integer[] numbers = {1, 2, 3, 4, 5};
        printArrayAnyTypes(numbers);
    }


//    public static void printArrayString(String[] array) {
//        for (String element : array) {
//            System.out.println("Element:" + element);
//        }
//    }

    public static <T> void printArrayAnyTypes(T[] array) {
        for (T element : array) {
            System.out.println("Element:" + element);
        }
    }
}
