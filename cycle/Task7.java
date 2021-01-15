package by.epam.training.cycle;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        long m;
        long n;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the start number: ");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.print("Enter the start number: ");
        }
        m = sc.nextLong();

        System.out.print("Enter the finish number: ");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.print("Enter the finish number: ");
        }
        n = sc.nextLong();

        for (long i = m; i <= n; i++) {
            System.out.print("Dividers for " + i + ": ");

            for (long j = 2; j < Math.abs(i); j++) {
                if (i % j == 0) {
                    System.out.print(j + "; ");
                }
            }

            System.out.print("\n");
        }
    }
}
