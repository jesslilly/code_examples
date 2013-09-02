/**
 * 
 */
package com.jesslilly.aggalg;

import java.util.List;

/**
 * @author jmlilly
 *
 */
public class SumAlgorithm implements AggregateAlgorithm {
	
	private Double sum;
	
	public SumAlgorithm() {
		super();
		sum = 0.0;
	}

	public void initialize(List<Double> numbers) {
		sum = 0.0;
		for (Double number : numbers) {
			append(number);
		}
	}

	public void append(Double number) {
		sum += number;
	}

	public void append(List<Double> numbers) {
		for (Double number : numbers) {
			append(number);
		}
	}

	public Double aggregate() {
		return getSum();
	}

	/**
	 * @return the sum
	 */
	public Double getSum() {
		return sum;
	}

}
