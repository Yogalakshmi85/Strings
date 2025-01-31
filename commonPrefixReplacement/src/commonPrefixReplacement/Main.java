package commonPrefixReplacement;

import java.util.Scanner;

public class Main {
	public static int commonPrefixReplacement(int k, String s) {
		int frq[] = new int[26];
		int left=0;
		int maxfreq=0;
		int maxWin=0;
		
		for(int right=0; right<s.length();right++) {
			frq[s.charAt(right)-'A']++;
			maxfreq=Math.max(maxfreq, frq[s.charAt(right)-'A']);
			
			int winLen=right-left+1;
			
			if(winLen-maxfreq>k) {
				left++;
				frq[s.charAt(right)-'A']--;
			}
			
			winLen=right-left+1;
			maxWin=Math.max(maxWin, winLen);
		}
		return maxWin;
	}
	public static void main(String[] args) {
		String string;
		Scanner scanner=new Scanner(System.in);
		string=scanner.nextLine();
		int k=scanner.nextInt();
		System.out.println(commonPrefixReplacement(k,string));
		scanner.close();
	}
}
