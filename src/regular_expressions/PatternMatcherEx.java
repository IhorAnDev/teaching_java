package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherEx {
    public static void main(String[] args) {
        String letter = "hello guys I send you my email and Joseph@gmail.com so we can keep in touch thank\n" +
                "you that's cool. I am sending you my address team@ukr.net let's stay in touch";
        Pattern email = Pattern.compile("(\\w+)@(gmail|ukr)\\.(com|net)");

        Matcher matcher = email.matcher(letter);
        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
