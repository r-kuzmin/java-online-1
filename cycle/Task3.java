package by.epam.training1.cycle;

/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 0; i < 100; i++) {
            // Ноль - это тоже число.
            res += i * i;
        }

        System.out.println("Summ = " + res);
    }
}
