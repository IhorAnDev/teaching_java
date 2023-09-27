package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClassFromClass = Person.class;
        Class personClassFromObj = person.getClass();
        Class personClassFromPath = Class.forName("reflection.Person");

//        Method[] methods = personClassFromClass.getMethods();
//        Arrays.stream(methods).forEach(method -> {
//            System.out.println(method.getName() + ", " + method.getReturnType()
//                    + ", " + Arrays.toString(method.getParameterTypes()));
//        });

//        Field[] fields = personClassFromClass.getDeclaredFields();
//        Arrays.stream(fields).forEach(field -> {
//            System.out.println(field.getName() + ", " + field.getType());
//        });
        Annotation[] annotations = personClassFromClass.getAnnotations();
        Arrays.stream(annotations).forEach(annotation -> {
            if (annotation instanceof Author){
                System.out.println("Yes");
            }
        });
    }
}
