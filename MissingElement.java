package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> firstlist= new ArrayList<Integer>();
		List<Integer> secondlist = new ArrayList<Integer>();
		Collections.addAll(firstlist,1,2,3,4,7,6,8);
		Collections.addAll(secondlist, 1,2,3,4,5,6,7,8,9,10);
		secondlist.removeAll(firstlist);
		System.out.println(secondlist);
	}

}
