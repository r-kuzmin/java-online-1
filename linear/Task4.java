package by.epam.training1.linear;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */
public class Task4 {
    public static void main(String[] args) {
        float x, y;

        System.out.println("Converting the number nnn.ddd to ddd.nnn");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        x = sc.nextFloat();

        /*
         * Получаем дробную часть x, сдвигаем влево на 3 разряда. Math.round нужно
         * потому, что в операциях с числами с плавающей точкой возникают погрешности.
         * Например: 999.123f - 999 = 0.12298584
         */
        y = Math.round((x - (int) x) * 1000);

        /*
         * Получаем целую часть x и cдвигаем вправо на 3 разряда. Суммируем с целой
         * частью y.
         */
        y = y + (int) x / 1000.0f;

        System.out.println("y = " + y);
    }
}
