package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Firstlist = new ArrayList<Integer>();
		List<Integer> Secondlist = new ArrayList<Integer>();
		Collections.addAll(Firstlist, 3,2,11,4,6,7);
		Collections.addAll(Secondlist, 1,2,8,4,9,7);
		Secondlist.retainAll(Firstlist);
		System.out.println(Secondlist);

	}

	}

