package task4;

public class App4_5 {

	public static void main(String[] args) {

		// Программа для нахождения наибольшего и наименьшего значений в массиве

		int array[] = { 14, 23, -11, 237, 33, 541, -3, 66, 33, 10 };

		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("Минимальный элемент массива: " + min);
		System.out.println("Максимальный элемент массива: " + max);

	}
}