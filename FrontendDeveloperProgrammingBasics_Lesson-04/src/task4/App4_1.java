﻿package task4;

public class App4_1 {

	public static void main(String[] args) {

		// Программа, выводящая на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ....

		int a = 1;
		int i = 1;

		while (i <= 55) {
			System.out.println(a);
			a = a + 2; // строит числовую последовательность, где каждый следующий элемент на 2 больше предыдущего
			i++; // счетчик
		}
	}
}