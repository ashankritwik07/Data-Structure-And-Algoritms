package pack1;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Swap two numbers by bitwise operators?
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
