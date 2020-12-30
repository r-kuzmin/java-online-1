package by.epam.training1.branching;

/**
 * Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = -10;
        int b = 0;
        int c  = 18;
        int d = 93;

        int minAB;
        int minCD;
        int res;

        minAB = (a < b) ? a : b;
        minCD = (c < d) ? c : d;
        res = (minAB > minCD) ? minAB : minCD;

        System.out.println("max{min(a, b), min(c, d)} = " + res);
    }
}
