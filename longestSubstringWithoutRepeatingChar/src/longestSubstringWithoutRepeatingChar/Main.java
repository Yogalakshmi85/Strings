package longestSubstringWithoutRepeatingChar;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static int longestSubstring(String s) {
		int ans=0;
		if (s==null || s.length()==0) {
			return 0;
		}
		if(s.length()==1) {
			return 1;
		}
		int left=0;
		int right=0;
			
		HashSet<Character> set=new HashSet<Character>();
			
		while(right<s.length()) {
			char c=s.charAt(right);
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(c);
			ans=Math.max(ans, right-left+1);
			right++;	
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String string=scanner.nextLine();
		System.out.println(longestSubstring(string));
		scanner.close();
	}

}
