package make_the_deadfish_swim;

/*
Напишите простой синтаксический анализатор, который будет анализировать и запускать Deadfish.

У Deadfish есть 4 команды, каждая длиной в 1 символ:

i увеличивает значение (изначально 0)
d уменьшает значение
s возводит в квадрат значение
o выводит значение в возвращаемый массив

Недопустимые символы следует игнорировать.

        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
* */

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] array = parse("iiisdosodddddiso");
        for (int i : array) {
            System.out.println(i);
        }

    }

    public static int[] parse(String data) {
        List<Integer> array = new ArrayList<>();
        int result = 0;
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i':
                    result++;
                    break;
                case 's':
                    result *= result;
                    break;
                case 'd':
                    result--;
                    break;
                case 'o':
                    array.add(result);
                    break;
            }
        }
        return array.stream().mapToInt(i -> i).toArray();
    }

}

