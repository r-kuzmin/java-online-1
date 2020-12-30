package by.epam.training1.branching;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 90;
        int b = 90;
        int c;

        c = 180 - a - b;

        if (c <= 0) {
            System.out.println("Треугольник задан неверно. Сумма углов больше 180 градусов.");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("Прямоугольный треугольник");
        } else {
            System.out.println("Остроугольный треугольник");
        }
    }
}
