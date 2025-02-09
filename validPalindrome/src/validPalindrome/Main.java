package validPalindrome;

import java.util.Scanner;

public class Main {
	
	public static boolean validPalindrome(String s) {
		int left=0;
		int right = s.length()-1;
		
		while(right>left) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) 
			{
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) 
			{
				right--;
			}
			if(Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
				return false;
			}
			left++;
			right--;
		}
			
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		System.out.println(validPalindrome(input));
		scanner.close();
	}

}
