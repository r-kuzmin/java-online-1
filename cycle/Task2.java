package by.epam.training.cycle;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h.
 */
public class Task2 {
    public static void main(String[] args) {
        double a = -5.8;
        double b = 5.1;
        double h = 0.5;

        double y;

        for (double x = a; x <= b; x += h) {
            y = (x > 2) ? x : -x;
            System.out.println("F(" + x + ") = " + y);
        }
    }
}
