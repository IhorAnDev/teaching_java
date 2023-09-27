package higest_scoring_word;

/*
Учитывая строку слов, вам нужно найти слово с наивысшим баллом.

Каждая буква слова оценивается в зависимости от ее положения в алфавите: a = 1, b = 2, c = 3 и т. д.

Вам нужно вернуть слово с наивысшим баллом в виде строки.

Если два слова оцениваются одинаково, верните слово, которое появляется первым в исходной строке.

Все буквы будут строчными, и все входные данные будут действительными.
*/

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "how to find taxi to ubud";
        String str1 = "abc def ghk";
        System.out.println(high(str));
    }


    public static String high(String s) {
        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;

            }
        }
        return winner;
    }
}
