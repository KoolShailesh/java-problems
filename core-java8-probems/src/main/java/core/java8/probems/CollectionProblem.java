package core.java8.probems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionProblem {
	
	public static void main(String[] args) {
		
		approach2();
		
	}

	private static void approach1() {
		List<String> orginalList = new ArrayList<>(Arrays.asList( "E","F","G","H"));
		System.out.println(orginalList);
		
		Collections.reverse(orginalList);
		
		List<String> newList = new ArrayList<>(Arrays.asList( "A","B","C","D"));
		System.out.println(newList);

		Collections.reverse(newList);
		orginalList.addAll(newList);
		
		Collections.reverse(orginalList);
		System.out.println(orginalList);
	}
	
	private static void approach2() {

		List<String> list = new ArrayList<>(Arrays.asList( "E","F","G","H"));
		List<String> prefix = new ArrayList<>(Arrays.asList( "A","B","C","D"));
		System.out.println(list.subList(0, 0));
		list.subList(0, 0).addAll(prefix);
		System.out.println(list);
	}

}
