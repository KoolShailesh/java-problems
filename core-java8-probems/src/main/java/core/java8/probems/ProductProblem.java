package core.java8.probems;

import java.util.Arrays;

/**
 * 
 * @author shailesh
 *
 *         {@link }https://stackoverflow.com/questions/58245358/given-an-array-of-numbers-return-array-of-products-of-all-other-numbers-with-d
 *
 *         Given an array of numbers, nums, return an array of numbers products,
 *         where products[i] is the product of all nums[j], j != i.
 * 
 *         Input : [1, 2, 3, 4, 5] Output: [(2*3*4*5), (1*3*4*5), (1*2*4*5),
 *         (1*2*3*5), (1*2*3*4)] = [120, 60, 40, 30, 24]
 *
 * 
 */
public class ProductProblem {

	public static void main1(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] outPut = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int res = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
			outPut[i] = res / arr[i];
		}
		System.out.println(Arrays.toString(outPut));

	}

	public static void main(String[] args) {

		int[] initialArray = new int[] { 1, 2, 3, 4, 5 };

		long finalProdcut = Arrays.stream(initialArray).reduce(1, (a,b) -> a+b);
		System.out.println(finalProdcut);

	}

}
