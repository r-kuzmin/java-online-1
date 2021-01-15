package by.epam.training.linear;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 * */
public class Task1 {
    public static void main(String[] args) {
        double a, b, c, z;
        
        System.out.println("Calculate the value of the function z = ( (a - 3 ) * b / 2) + c");
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        a = sc.nextDouble();

        System.out.print("Enter the number b: ");
        b = sc.nextDouble();

        System.out.print("Enter the number c: ");
        c = sc.nextDouble();

        z = ( (a - 3 ) * b / 2) + c;

        System.out.println("z = " + z);
    }
}
