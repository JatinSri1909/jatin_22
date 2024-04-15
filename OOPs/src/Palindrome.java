/* WAJP to check if a input "String" value is a palindrome or not.  */

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = scanner.nextLine();
        
        if (isPalindrome(inputString)) {
            System.out.println("Input string is a palindrome.");
        } else {
            System.out.println("Input string is not a palindrome.");
        }
	}
	
	private static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
