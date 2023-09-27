package interview;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberExample {
    public static void main(String[] args) {

    }

    private static List<Integer> isPrimeNumber(int startNumber, int endNumber) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int number = startNumber; number <= endNumber; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
