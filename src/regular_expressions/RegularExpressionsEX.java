package regular_expressions;

public class RegularExpressionsEX {
    public static void main(String[] args) {
//        String a = "+124545";
//        String b = "-124545";
//        String c = "124545";
//        System.out.println(a.matches("(-|\\+)?\\d+"));
//        System.out.println(b.matches("(-|\\+)?\\d+"));
//        System.out.println(c.matches("(-|\\+)?\\d+"));

        String d = "a124545";
        String e = "F124545";
        String f = "d124545";
        String g = "G124545";
        System.out.println(d.matches("[abc]\\d*"));
        System.out.println(e.matches("[A-Za-z]\\d*"));
        System.out.println(f.matches("[A-Z, a-z]\\d*"));
        System.out.println(g.matches("[A-Z, a-z]\\d*"));
    }
}