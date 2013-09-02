/**
 * 
 */
package com.jesslilly.aggalg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jmlilly
 * 
 */
public class MedianAlgorithm implements AggregateAlgorithm {

	// We need to maintain the list of numbers to calc the median.
	// We also need to keep it sorted.
	private ArrayList<Double> sortedNumbers;

	public void initialize(List<Double> numbers) {
		sortedNumbers = new ArrayList<Double>(numbers);
		Collections.sort(sortedNumbers);
	}

	public void append(Double number) {
		int insertAt = Collections.binarySearch(sortedNumbers, number);
		if (insertAt < 0) {
			sortedNumbers.add(number);
		} else {
			sortedNumbers.add(insertAt, number);
		}
	}

	public void append(List<Double> numbers) {
		sortedNumbers.addAll(numbers);
		Collections.sort(sortedNumbers);
	}

	public Double aggregate() {
		Double median = 0.0;
		boolean odd = ((sortedNumbers.size() & 1) == 1);
		if (odd) {
			int midIndex = ((sortedNumbers.size() - 1) / 2);
			median = sortedNumbers.get(midIndex);
		} else {
			// even
			// Get two "mid indexes" and average the values.
			int index1 = ((sortedNumbers.size() / 2) - 1);
			int index2 = index1 + 1;
			median = (sortedNumbers.get(index1) + sortedNumbers.get(index2)) / 2.0;
		}
		return median;
	}

}
