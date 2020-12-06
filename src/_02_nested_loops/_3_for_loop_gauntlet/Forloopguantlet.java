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
				System.out.println(i + "even");
			
			}
			if (i % 2 == 1) {
				System.out.println(i +"odd");
			
		
			}
	
	}
	for (int i = 0; i < 784; i++) {
		if(i % 7 == 0) {
			System.out.println(i);
		}
		}
	for (int i = 2005; i < 2021; i++) {
		System.out.println(" in " +i+ " I was "+(i-2005)+" years old");
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		 System.out.println(i+ " " +j);
		}
		
	}
	for (int i = 1; i <= 7; i+=3) {
		for (int j = i; j <= i+2; j++) {
		System.out.print(j);	
		}
		System.out.println();
		
	}
	for (int i = 1; i <= 91; i+=10) {
		for (int j = i; j < i+10; j++) {
		System.out.print(j);	
		}
		System.out.println();
	}
	for (int i = 1; i < 7; i++) {
		for (int j =  0; j < i; j++) {
			System.out.print(" * ");	
		}
		System.out.println();
		
		
	}
	}
}