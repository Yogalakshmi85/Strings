package validParenthesis;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static boolean validParenthesis(String s) {
		if(s.length()==0) return false;
		HashMap<Character, Character> mappedBrackets=new HashMap<Character, Character>();
		mappedBrackets.put('(', ')');
		mappedBrackets.put('[', ']');
		mappedBrackets.put('{', '}');
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(mappedBrackets.containsKey(c)) {
				st.push(c);
			}
			else {
				if(st.isEmpty()) return false;
				
				else {
					char popped=st.pop();
					if(c!=mappedBrackets.get(popped)) {
						return false;
					}
				}
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String string=scanner.nextLine();
		if(validParenthesis(string)) System.out.println("Valid");
		else System.out.println("Invalid");
		scanner.close();
	}

}
