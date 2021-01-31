package by.epam.training.cycle;

/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
	public static void main(String[] args) {
		int res = 0;

		// Ноль - это тоже число.
		for (int i = 0; i < 100; i++) {
			res += i * i;
		}

		System.out.println("Summ = " + res);
	}
}
