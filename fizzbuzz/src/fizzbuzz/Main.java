package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static List<String> fizzbuzz(int n) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=1;i<=n;i++) {
			if(i%3 ==0 && i%5==0) list.add("fizzbuzz");
			
			else if(i%3==0) list.add("fizz");
			
			else if(i%5==0) list.add("buzz");
			
			else list.add(Integer.toString(i));
		}
		return list;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner scanner= new Scanner(System.in);
		n=scanner.nextInt();
		System.out.println(fizzbuzz(n));
		scanner.close();
	}
}
