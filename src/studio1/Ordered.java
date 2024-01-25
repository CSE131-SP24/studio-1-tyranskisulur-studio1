package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean isOrdered = true;
		
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean asc = (x < y && y < z);
		boolean des = (x > y && y > z);
		
		isOrdered = asc || des;
		
		System.out.println(isOrdered);
	
		
	}

}
