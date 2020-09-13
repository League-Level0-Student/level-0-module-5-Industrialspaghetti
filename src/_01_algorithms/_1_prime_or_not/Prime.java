package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("please insert a number");
		int Number = Integer.parseInt(number);

		for (int i = 2; i < Number; i++) {
			if (Number % i == 0) {

				System.out.println("number is not prime");

				System.exit(0);

			}

		}
		System.out.println("ur number is prime");

	}
}
