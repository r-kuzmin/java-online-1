package by.epam.training1.cycle;

import java.util.Scanner;

/**
 * Пользователь вводит любое целое положительное число. Программа суммирует все
 * числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int x;
        long res = 0;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter the number: ");
        }

        x = sc.nextInt();
        if (x < 0) {
            System.out.println("Error. Negative number entered.");
            return;
        }

        for (int i = 1; i < x; i++) {
            res += i;
        }

        System.out.println("Summ(x) = " + res);
    }
}
