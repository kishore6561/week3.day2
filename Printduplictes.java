package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Printduplictes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> List = new ArrayList<Integer>();
		Collections.addAll(List, 14,12,13,11,15,14,18,16,17,19,18,17,20);
		Set<Integer> s = new HashSet<Integer>();
		for(int duplicates:List) {
		if(!s.add(duplicates)) {
			System.out.println(duplicates);
		}
	}
	}
}
