/**
 * 
 */
package com.jesslilly.aggalg;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jmlilly
 *
 */
public class MaxAlgorithmTest {
	
	public final static List<Double> POSITIVE_INTEGERS = Arrays.asList(1.0d,2.0d,3.0d);
	public final static Double POSITIVE_INTEGERS_MAX = new Double(3.0);
	public final static MaxAlgorithm POSITIVE_INTEGERS_ALG = new MaxAlgorithm();
	
	public final static List<Double> NEGATIVE_INTEGERS = Arrays.asList(-1.0d,-2.0d,-3.0d);
	public final static Double NEGATIVE_INTEGERS_MAX = new Double(-1.0);
	public final static MaxAlgorithm NEGATIVE_INTEGERS_ALG = new MaxAlgorithm();


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		POSITIVE_INTEGERS_ALG.initialize(POSITIVE_INTEGERS);
		NEGATIVE_INTEGERS_ALG.initialize(NEGATIVE_INTEGERS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInitialize_Positive() {
		assertEquals(POSITIVE_INTEGERS_ALG.aggregate(),POSITIVE_INTEGERS_MAX);
	}

	@Test
	public void testInitialize_Negative() {
		assertEquals(NEGATIVE_INTEGERS_ALG.aggregate(),NEGATIVE_INTEGERS_MAX);
	}

	@Test
	public void testAppendDouble_More() {
		POSITIVE_INTEGERS_ALG.append(new Double(4.0));
		assertEquals(POSITIVE_INTEGERS_ALG.aggregate(),new Double(4.0));
	}

	@Test
	public void testAppendDouble_Less() {
		POSITIVE_INTEGERS_ALG.append(new Double(1.0));
		assertEquals(POSITIVE_INTEGERS_ALG.aggregate(),POSITIVE_INTEGERS_MAX);
	}

	@Test
	public void testAppendListOfDouble() {
		NEGATIVE_INTEGERS_ALG.append(POSITIVE_INTEGERS);
		assertEquals(NEGATIVE_INTEGERS_ALG.aggregate(),POSITIVE_INTEGERS_MAX);
	}

}
