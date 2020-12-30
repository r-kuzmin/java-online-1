package by.epam.training1.linear;

/**
 * Для данной области составить линейную программу, которая печатает true, если
 * точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае.
 */
public class Task6 {
    public static void main(String[] args) {
        /*
         * Представим закрашенную область как 2 прямоугольника. Если точка принадлежит
         * одному из них, значит она принадлежит области.
         */
        int x = 0;
        int y = 1;

        int x11 = -2;
        int x12 = 2;
        int y11 = 0;
        int y12 = 4;

        int x21 = -4;
        int x22 = 4;
        int y21 = -3;
        int y22 = 0;

        if (((x > x11) && (x < x12) && (y > y11) && (y < y12))
            || ((x > x21) && (x < x22) && (y > y21) && (y < y22))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
