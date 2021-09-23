package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ListInt= new ArrayList<Integer>();
		Collections.addAll(ListInt, 3,2,11,4,6,7);
		Collections.sort(ListInt);
		int Max =Collections.max(ListInt); 
		ListInt.remove(ListInt.indexOf(Max)); 
		System.out.println(Collections.max(ListInt));
	}

}
