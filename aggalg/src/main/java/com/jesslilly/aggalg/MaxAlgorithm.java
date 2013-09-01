/**
 * 
 */
package com.jesslilly.aggalg;

import java.util.List;

/**
 * @author jmlilly
 *
 */
public class MaxAlgorithm extends AggregateAlgorithmImpl {
	
	private Double max;
	
	public MaxAlgorithm() {
		super();
		max = null;
	}

	@Override
	public void initialize(List<Double> numbers) {
		for (Double number : numbers) {
			append(number);
		}
	}

	@Override
	public void append(Double number) {
		super.append(number);
		if (max == null || number > max) {
			max = number;
		}
	}

	@Override
	public void append(List<Double> numbers) {
		for (Double number : numbers) {
			append(number);
		}
	}

	/* (non-Javadoc)
	 * @see com.jesslilly.aggalg.AggregateAlgorithm#aggregate()
	 */
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
