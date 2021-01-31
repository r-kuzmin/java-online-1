package by.epam.training.cycle;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int a = 1220446789;
        int b = 351207;
        
        int bTemp;

        int x;
        int y;

        while (a > 0) {
            x = a % 10; // Первая справа цифра числа a.
            a /= 10; // Остальные цифры числа a.
            bTemp = b;

            while (b > 0) {
                y = b % 10;
                b /= 10;

                if (x == y) {
                    System.out.print(x + "; ");
                }

            }
            b = bTemp;
        }
    }
}
