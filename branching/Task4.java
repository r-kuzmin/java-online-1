package by.epam.training.branching;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int x = 6;
        int y = 8;
        int z = 12;

        if (x <= a && y <= b || y <= a && x <= b
            || x <= a && z <= b || z <= a && x <= b
            || z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Пройдет.");
        } else {
            System.out.println("Не пройдет.");
        }
    }
}
