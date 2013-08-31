/**
 * 
 */
package com.jesslilly.aggalg;

import java.util.List;

/**
 * @author jmlilly
 * TODO: Consider enhancing to use a generic type instead of Double.
 *
 */
public interface AggregateAlgorithm {
	public void initialize(List<Double> numbers);
	public void append(Double number);
	public void append(List<Double> numbers);
	public Double aggregate();
}
