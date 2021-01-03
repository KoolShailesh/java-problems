package core.java8.probems;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntstreamStatsCombine {

	public static void main(String[] args) {
		
		Comparator<Integer> comparator = ( o1,  o2) -> o1 - o2;
			
			

		IntStream intStream1 = IntStream.of(1, 3, 5, 7, 9, 11, 13, 1, 12, 345,323,23234);

		IntSummaryStatistics summaryStatistics1 = intStream1.summaryStatistics();

		System.out.println(summaryStatistics1);

		IntStream intStream2 = IntStream.of(11, 2233, 544, 744, 944, 4411, 143, 165, 142, 356545);
		IntSummaryStatistics summaryStatistics2 = intStream2.summaryStatistics();
		System.out.println(summaryStatistics2);
		
		summaryStatistics1.combine(summaryStatistics2);
		
		System.out.println(summaryStatistics1);
		System.out.println(summaryStatistics2);
		
		summaryStatistics2.combine(summaryStatistics1);
		
		System.out.println(summaryStatistics2);

	}

}
