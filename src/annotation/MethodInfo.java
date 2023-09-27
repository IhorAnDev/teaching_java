package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface MethodInfo {
    String author() default "Pipkin";

    int dateOfCreation() default 2022;

    String purpose();
}
