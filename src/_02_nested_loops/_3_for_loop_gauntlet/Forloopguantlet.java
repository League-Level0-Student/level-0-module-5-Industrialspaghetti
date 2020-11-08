package _02_nested_loops._3_for_loop_gauntlet;

public class Forloopguantlet {
	public static void main(String[] args) {
		// 1:

		for (int i = 0; i < 101; i++) {
			System.out.println(i);

		}
		// 2.

		for (int i = 100; i >= 0; i--) {
			System.out.println(i);

		}
		// 3.

		for (int i = 2; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		for (int i = 1; i <= 99; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
	
		}
	for (int i = 1; i < 501; i++) {
			
			if( i % 2 == 0) {
				System.out.println(i + "eve");
			
			}
			if (i % 2 == 1) {
				System.out.println(i +"odd");
			
			}
		
	
	}
		
	}
}