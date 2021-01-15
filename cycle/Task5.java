package by.epam.training.cycle;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е.
 */
public class Task5 {
    public static void main(String[] args) {
        double an;
        double e;
        double sum;

        an = 2.0; // Первый член ряда при n = 0.
        e = 0.7;
        sum = 0;

        for (int n = 1; Math.abs(an) >= e; n++) {
            sum += an;
            an = 1.0 / Math.pow(2, n) + 1.0 / Math.pow(3, n);
        }

        System.out.println("Sum(an) = " + sum);
    }
}
