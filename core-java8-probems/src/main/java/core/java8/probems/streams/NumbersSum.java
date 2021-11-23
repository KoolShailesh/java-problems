package core.java8.probems.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NumbersSum {

	public static void _main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(5);

		Long collect = l.stream().map(n -> n * n).collect(Collectors.summingLong(Integer::intValue));

		System.out.println(collect);

		int sum = l.stream().mapToInt(Integer::intValue).map(n -> n * n).sum();

		System.out.println(sum);

		OptionalInt reduce = l.stream().mapToInt(Integer::intValue).reduce((a, b) -> a + b);

		System.out.println(reduce.getAsInt());

	}

}
