package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {	
	
	public static List<List<String>> groupAnagrams(String[] words) {
		if(words.length==0) {
			return new ArrayList<>();
		}
		
		HashMap< String, List<String>> ansHashMap=new HashMap<String, List<String>>();
		int[] count=new int[26];
		
		for(String string : words) {
			Arrays.fill(count, 0);
			for(char c: string.toCharArray()) {
				count[c - 'a']++;
			}
			
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<26;i++) {
				sb.append(count[i]);
			}
			
			String keyString= sb.toString();
			if(!ansHashMap.containsKey(keyString)) {
				ansHashMap.put(keyString, new ArrayList<>());
			}
			ansHashMap.get(keyString).add(string);
		}
		return new ArrayList<>(ansHashMap.values());
	}
	
	public static void main(String[] args) {
		String input;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a set of words separated with space");
		input=scanner.nextLine();
		scanner.close();
		
		String words[]=input.split(" ");
		List<List<String>> res=groupAnagrams(words);
		System.out.println(res.toString());
	}
}
