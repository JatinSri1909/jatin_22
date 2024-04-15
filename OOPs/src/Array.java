/* WAJP to create an array(2D) with following data.
                     {{1,2,3,4}, {1,2}, {1,2,3,4,5}}

Scan data using keyboard with scanner class.

Print the data using stored in the array. */

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int data[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Scanner scanner = new Scanner(System.in);
		
		for( int i = 0; i < data.length; i++) {
			for( int j = 0; j < data[i].length; j++) {
				System.out.print("Enter value for data[" + i + "][" + j + "]: ");
				data[i][j] = scanner.nextInt();
			}
		}
		
		 System.out.println("Data stored in the array:");
	        for (int i = 0; i < data.length; i++) {
	            for (int j = 0; j < data[i].length; j++) {
	                System.out.print(data[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
}
