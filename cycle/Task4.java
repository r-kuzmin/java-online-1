package by.epam.training1.cycle;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        long res = 1;

        for (int i = 2; i <= 200; i++) {
            // Ноль - число, но с него начинать нет смысла, произведение будет равно 0.
            // Квадрат 1 уже записан, пропускаем.
            if (res * i * i < 0) {
                System.out.println("Overflow occured.");
                return;
            } else {
                res *= i * i;
                System.out.println("Comp(" + i + ") = " + res);
            }
        }
    }
}
