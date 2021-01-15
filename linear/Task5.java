package by.epam.training.linear;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc.
 */
public class Task5 {
    public static void main(String[] args) {
        long t, h, m, s;
        int hour = 3600;
        int minute = 60;

        System.out.println("Converting a number to 'ННч ММмин SSc'");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number T: ");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.print("Enter the number T: ");
        }
        t = sc.nextLong();

        h = t / hour;
        m = (t - h * hour) / minute;
        s = (t - h * hour - m * minute);

        System.out.println(h + "ч " + m + "мин " + s + "с");
    }
}
