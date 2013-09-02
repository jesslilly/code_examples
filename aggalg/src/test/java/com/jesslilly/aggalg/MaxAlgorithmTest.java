/**
 * 
 */
package com.jesslilly.aggalg;

import static org.junit.Assert.*;
import java.util.ArrayList;

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
	
	public final static Double LIST_DOUBLE_1_2_3_MAX = new Double(3.0);
	public final static MaxAlgorithm LIST_DOUBLE_1_2_3_ALG = new MaxAlgorithm();
	
	public final static Double LIST_DOUBLE_NEG_1_2_3_MAX = new Double(-1.0);
	public final static MaxAlgorithm LIST_DOUBLE_NEG_1_2_3_ALG = new MaxAlgorithm();


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		LIST_DOUBLE_1_2_3_ALG.initialize(TestData.LIST_DOUBLE_1_2_3);
		LIST_DOUBLE_NEG_1_2_3_ALG.initialize(TestData.LIST_DOUBLE_NEG_1_2_3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAggregate_Positive() {
		assertEquals(LIST_DOUBLE_1_2_3_ALG.aggregate(),LIST_DOUBLE_1_2_3_MAX);
	}

	@Test
	public void testAggregate_Negative() {
		assertEquals(LIST_DOUBLE_NEG_1_2_3_ALG.aggregate(),LIST_DOUBLE_NEG_1_2_3_MAX);
	}

	@Test
	public void testAppendDouble_More() {
		LIST_DOUBLE_1_2_3_ALG.append(new Double(4.0));
		assertEquals(LIST_DOUBLE_1_2_3_ALG.aggregate(),new Double(4.0));
	}

	@Test
	public void testAppendDouble_Less() {
		LIST_DOUBLE_1_2_3_ALG.append(new Double(1.0));
		assertEquals(LIST_DOUBLE_1_2_3_ALG.aggregate(),LIST_DOUBLE_1_2_3_MAX);
	}

	@Test
	public void testAppendListOfDouble() {
		LIST_DOUBLE_NEG_1_2_3_ALG.append(TestData.LIST_DOUBLE_1_2_3);
		assertEquals(LIST_DOUBLE_NEG_1_2_3_ALG.aggregate(),LIST_DOUBLE_1_2_3_MAX);
	}

}
