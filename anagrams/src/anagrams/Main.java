package anagrams;

import java.util.Scanner;

public class Main {
	public static boolean anagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		int count[] = new int[26];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String t=scanner.nextLine();
		System.out.println(anagram(s, t));
		scanner.close();
	}
}
