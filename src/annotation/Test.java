package annotation;


public class Test {
    @MethodInfo(author = "Ihor", dateOfCreation = 2023, purpose = "Print Hello world")
    public void printHello() {
        System.out.println("Hello world!");
    }
}
