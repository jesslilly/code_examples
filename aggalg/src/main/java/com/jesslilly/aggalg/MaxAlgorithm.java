/**
 * 
 */
package com.jesslilly.aggalg;

import java.util.List;

/**
 * @author jmlilly
 *
 */
public class MaxAlgorithm implements AggregateAlgorithm {
	
	private Double max;
	
	public MaxAlgorithm() {
		super();
		max = null;
	}

	public void initialize(List<Double> numbers) {
		max = null;
		for (Double number : numbers) {
			append(number);
		}
	}

	public void append(Double number) {
		if (max == null || number > max) {
			max = number;
		}
	}

	public void append(List<Double> numbers) {
		for (Double number : numbers) {
			append(number);
		}
	}

	public Double aggregate() {
		return getMax();
	}

	/**
	 * @return the max
	 */
	public Double getMax() {
		return max;
	}

}
