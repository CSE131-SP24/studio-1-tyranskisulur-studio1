package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		boolean leapYear = true;
		
		System.out.println("Enter a year: ");
		int x = in.nextInt();
		
		boolean rule1 = (x % 4 == 0);
		boolean rule2 = (x % 100 != 0);
		boolean rule3 = (x % 400 == 0);
		
		leapYear = (rule1 && rule2) || rule3;
		
		System.out.println(leapYear);
		
		
	}

}
