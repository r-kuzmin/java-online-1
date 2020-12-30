package by.epam.training1.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле ...
 * (все переменные принимают действительные значения)
 */
public class Task2 {
    public static void main(String[] args) {
        double a, b, c, z;
        
        System.out.println("Calculate the value of the function z = (b + sqrt(b^2 + 4ac)) / 2a - (a^3)c + b^-2");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a:");
        a = sc.nextDouble();

        System.out.println("Enter the number b:");
        b = sc.nextDouble();

        System.out.println("Enter the number c:");
        c = sc.nextDouble();

        z = Math.pow(b, 2) + 4 * a * c;
        z = (Math.sqrt(z) + b) / (2 * a);
        z = z - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("z = " + z);
    }
}
