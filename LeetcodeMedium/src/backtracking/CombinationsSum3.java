package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationsSum3 {
	// sum to n
	// with count of k
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		for (int i = 1; i < 10; i++) {
			// each i will be the first number to the array list of possible comb
			// if the current total is greater than n then we are done
			// if the count is greater than k we are done
			// if the sum equals n and the count is k, we found a result to add
			ArrayList<Integer> next = new ArrayList<Integer>();
			next.add(i);
			tryCombo(k - 1, n - i, i + 1, results, next);
		}
		return results;
	}

	private void tryCombo(int k, int n, int nextNum,
			List<List<Integer>> results, List<Integer> current) {
		if (k > 0 && n > 0 && nextNum < 10) {
			for (int i = nextNum; i < 10; i++) {
				ArrayList<Integer> next = new ArrayList<Integer>();
				next.add(i);
				next.addAll(current);
				tryCombo(k - 1, n - i, i + 1, results, next);
			}
		} else if (k == 0 && n == 0) {
			Collections.sort(current);
			results.add(current);
		} // else we went too far and are done
	}

	public static void main(String[] args) {
		CombinationsSum3 test = new CombinationsSum3();
		System.out.println(test.combinationSum3(3, 9));
	}
}
