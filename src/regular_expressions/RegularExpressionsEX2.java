package regular_expressions;

import java.util.Arrays;

public class RegularExpressionsEX2 {
    public static void main(String[] args) {
        String str = "Hello.2342343hey123123cool";
        String[] arr = str.split("(\\.)?\\d+");

        String str2 = "Hello how are you?";
        System.out.println(str2.replaceAll("[a-zA-Z]{5}", "Privet"));
    }
}