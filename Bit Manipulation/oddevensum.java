package pack1;

import java.util.Scanner;

public class oddevensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // check weather a number is odd or even by bitwise operators?
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if((a&1)==0){
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
