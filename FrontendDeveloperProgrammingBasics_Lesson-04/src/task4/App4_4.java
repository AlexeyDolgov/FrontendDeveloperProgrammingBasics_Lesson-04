package task4;

public class App4_4 {

	public static void main(String[] args) {

		// Программа, выводящая на экран ближайшее к 10 из двух чисел, записанных в
		// переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

		int a;
		double m;
		double n;

		a = 10;
		m = 8.5;
		n = 11.45;

		// Чтобы при вычитании не вычислять большее из чисел результат сравниваем по модулю

		if (Math.abs(a - m) < Math.abs(a - n)) {
			System.out.println(m);
		} else if (Math.abs(a - m) > Math.abs(a - n)) {
			System.out.println(n);
		} else {
			System.out.println("Оба числа одинаково близки к " + a);
		}
	}
}