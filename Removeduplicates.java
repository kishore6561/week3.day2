package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "We learn java basics as part of java sessions in java week1";	
		String text = input.replaceAll("\\s","");
		System.out.println(text);
		char[] chArray = text.toCharArray();
		Set<Character>charset = new LinkedHashSet<Character>();
		for(char c: chArray) {
			if(charset.add(c)) {
				charset.add(c);	
			}
		}
		System.out.println(charset);

	}

}
