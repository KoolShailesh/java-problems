package core.java8.probems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionProblem {
	
	public static void main(String[] args) {
		
		approach1();
		
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
	
	public void approach2() {

		List<String> list = new ArrayList<>(Arrays.asList( "E","F","G","H"));
		List<String> prefix = new ArrayList<>(Arrays.asList( "A","B","C","D"));
		
		list.subList(0, 1).addAll(prefix);
		System.out.println(list);
	}

}
