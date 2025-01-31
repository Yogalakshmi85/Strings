package commonPrefix;

import java.util.Scanner;

public class Main {
	
	public static String commonPrefix(int n, String[] strings) {
		if(n==0 || strings==null) {
			return "No data availabale";
		}
		String prefix=strings[0];
		
		for(int i=1;i<n;i++) {
			while(strings[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.length()==0) {
					return "No Common prefix";
				}
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the no of elements:");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		scanner.nextLine();
		String[] strings=new String[n];
		for(int i=0;i<n;i++) {
			strings[i]=scanner.nextLine();
		}
		System.out.println(commonPrefix(n, strings));
		scanner.close();
	}
	
}


