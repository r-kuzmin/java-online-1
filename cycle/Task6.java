package by.epam.training.cycle;

import java.util.Scanner;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера.
 * 
 * !!! Условие задачи не полное и содержит опечатки, поэтому додумываем сами.
 * Предположим, что пользователь должен ввести начальный и конечный коды, а программа
 * должна вывести на экран все коды из этого диапазона и символы, им соответствующие.
 */
public class Task6 {
    public static void main(String[] args) {
        int a;
        int b;
        char s;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the start code: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter the start code: ");
        }

        a = sc.nextInt();
        if (a < 0) {
            System.out.println("Character code cannot be negative.");
            return;
        }

        System.out.print("Enter the finish code: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter the finish code: ");
        }

        b = sc.nextInt();
        if (b < 0) {
            System.out.println("Character code cannot be negative.");
            return;
        }

        for (int i = a; i <= b; i++) {
            s = (char) i;
            System.out.println("Symbol '" + s + "' = " + i);
        }
    }
}
