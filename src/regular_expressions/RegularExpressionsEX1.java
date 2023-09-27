package regular_expressions;

public class RegularExpressionsEX1 {
    public static void main(String[] args) {

        String url = "https://www.rem.co.ua";
        String google = "https://www.google.com";
        String example = "hey bro";
        System.out.println(url.matches("http[s]?://www\\..+\\.(com|.+)(\\.ua)?"));
        System.out.println(google.matches("http[s]?://www\\..+\\.(com|.+)(\\.ua)?"));
        System.out.println(example.matches("http[s]?://www\\..+\\.(com|.+)(\\.ua)?"));
    }
}