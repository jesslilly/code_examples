/**
 * 
 */
package com.jesslilly.aggalg;

import java.util.List;

/**
 * @author jmlilly
 *
 */
public abstract class AggregateAlgorithmImpl implements AggregateAlgorithm {
	
	private List<Double> numbers;

	/* (non-Javadoc)
	 * @see com.jesslilly.aggalg.AggregateAlgorithm#initialize(java.util.List)
	 */
	public void initialize(List<Double> numbers) {
		this.numbers = numbers;
	}

	/* (non-Javadoc)
	 * @see com.jesslilly.aggalg.AggregateAlgorithm#append(java.lang.Double)
	 */
	public void append(Double number) {
		this.numbers.add(number);
	}

	/* (non-Javadoc)
	 * @see com.jesslilly.aggalg.AggregateAlgorithm#append(java.util.List)
	 */
	public void append(List<Double> numbers) {
		this.numbers.addAll(numbers);
	}

}
