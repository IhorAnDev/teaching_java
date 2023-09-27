package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Scanner;

public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        Class<?> classObj1 = Class.forName(scanner.next());
//        Class<?> classObj2 = Class.forName(scanner.next());
        Class<?> classObj3 = Class.forName(scanner.next());
        String methodName = scanner.next();


        Method method = classObj1.getMethod(methodName, classObj3);

        Constructor<?> constructor = classObj1.getConstructor();
        Constructor<?> constructor2 = classObj3.getConstructor();

        Object o1 = constructor.newInstance();
//        Object o2 = classObj2.getConstructor(String.class).newInstance("String value");
        Object o3 = constructor2.newInstance();

        method.invoke(o1, o3);


    }
}
