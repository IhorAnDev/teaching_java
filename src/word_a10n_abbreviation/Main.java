package word_a10n_abbreviation;

/*

Слово i18n — это общепринятая аббревиатура интернационализации в сообществе разработчиков, используемая вместо того,
чтобы вводить слово целиком и пытаться правильно его написать. Точно так же a11y является аббревиатурой доступности.

Напишите функцию, которая берет строку и превращает любые и все «слова» (см. ниже) в этой строке длиной 4 или больше
в аббревиатуру, следуя этим правилам:

«Слово» — это последовательность букв алфавита. Согласно этому определению, любой другой символ,
 такой как пробел или дефис (например, «поездка на слоне»), разделит последовательность букв на два слова (например,
  «слон» и «поездка»).
Сокращенная версия слова должна иметь первую букву, затем количество удаленных символов, затем последнюю букву (например,
 «поездка на слонах» = «e6t r2e»).
 assertEquals("i18n", abbr.abbreviate("internationalization"));
* */


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String str = main.abbreviate("elephand");
        System.out.println(str);
    }

    public String abbreviate(String string) {
        Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(string);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String g = m.group();
            int l = g.length();
            m.appendReplacement(sb, g.substring(0, 1) + (l - 2) + g.substring(l - 1, l));
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
