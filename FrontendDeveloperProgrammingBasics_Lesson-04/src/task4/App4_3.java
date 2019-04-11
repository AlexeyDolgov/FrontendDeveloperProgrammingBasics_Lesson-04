package task4;

public class App4_3 {

	public static void main(String[] args) {

		// Программа, проверяющая на четность/нечетность целые числа, записаные в переменную n.

		int n = 23;

		if (n % 2 == 0) {
			System.out.println("Число " + n + " является чётным");
		} else {
			System.out.println("Число " + n + " является нечётным");
		}
	}
}