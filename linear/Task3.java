package by.epam.training.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле ...
 * (все переменные принимают действительные значения):
 */
public class Task3 {
    public static void main(String[] args) {
        double x, y, z;
        
        System.out.println("Calculate the value of the function z = (sin(x) + cos(y)) / (cos(x) - sin(x)) * tg(xy)");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number x:");
        x = sc.nextDouble();

        System.out.println("Enter the number y:");
        y = sc.nextDouble();

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
        z = z * Math.tan(x * y);

        System.out.println("z = " + z);
    }
}
