package numberOfPalindromicSubstring;

import java.util.Scanner;

public class Main {

	public static int CountValidPalindromicSubstring(String s) {
		if(s.length()==0) return 0;
		
		int ans=0;
		
		for(int i=0;i<s.length();i++) {
			ans+=validPalindromes(s, i, i);
			ans+=validPalindromes(s, i, i+1);
		}
		return ans;
	}
	
	public static int validPalindromes(String s, int left, int right) {
		int count=0;
		
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		System.out.println(CountValidPalindromicSubstring(string));
		sc.close();
	}

}
