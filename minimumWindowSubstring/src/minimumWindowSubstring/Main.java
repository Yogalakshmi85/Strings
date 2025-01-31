package minimumWindowSubstring;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static String minimumWindowSubstring(String s, String t) {
		if(s.length()==0 || t.length()==0 || s.length()<t.length()) {
			return "";
		}
		HashMap<Character, Integer> mapt=new HashMap<Character, Integer>();
		for(int i=0;i<t.length();i++) {
			mapt.put(t.charAt(i), mapt.getOrDefault(t.charAt(i), 0)+1);
		}
		int req=mapt.size();
		int l=0, r=0, create=0;
		int arr[]= {-1, 0, 0};
		HashMap<Character, Integer> subt=new HashMap<Character, Integer>();
		while(r<s.length()){
			char c= s.charAt(r);
			int count=subt.getOrDefault(c, 0);
			subt.put(c, count+1);
			if(mapt.containsKey(c) && subt.get(c).intValue() == mapt.get(c).intValue()) {
				create++;
			}
			while(l<=r && req==create) {
				c=s.charAt(l);
				if(arr[0]==-1 || arr[0]>= r-l+1) {
					arr[0]=r-l+1;
					arr[1]=l;
					arr[2]=r;
				}
				subt.put(c, subt.get(c)-1);
				if(mapt.containsKey(c) && subt.get(c).intValue() < mapt.get(c).intValue()) {
					create--;
				}
				l++;
			}
			r++;			
		}
		if(arr[0]==-1) return "";
		return s.substring(arr[1], arr[2]+1);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String t=scanner.nextLine();
		System.out.println(minimumWindowSubstring(s, t));
		scanner.close();
	}

}
