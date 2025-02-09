package longestPalindromeSubstring;

import java.util.Scanner;

public class Main {
	
	public static String longestPalindromicSubstring(String s) {
		int left=0, right=0;
		if(s.length()==0) return null;
		
		for(int i=0;i<s.length();i++) {
			int len1=validPalindrome(s,i,i);
			int len2=validPalindrome(s, i, i+1);
			int len=Math.max(len1, len2);
			
			if(len>right-left) {
				left=i-(len-1)/2;
				right=i+ len/2;
			}
		}
		return s.substring(left, right+1);
	}
	
	public static int validPalindrome(String s, int left, int right) {
		int l=left, r=right;
		while(l>=0 && r<s.length()&& s.charAt(l)==s.charAt(r)) {
			l--;
			r++;
		}
		return r-l-1;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		System.out.println(longestPalindromicSubstring(string));
		scanner.close();
	}

}
