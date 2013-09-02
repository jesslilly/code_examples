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
public class SumAlgorithmTest {
	
	public final static Double LIST_DOUBLE_1_2_3_SUM = new Double(6.0);
	public final static SumAlgorithm LIST_DOUBLE_1_2_3_ALG = new SumAlgorithm();
	
	public final static Double LIST_DOUBLE_NEG_1_2_3_SUM = new Double(-6.0);
	public final static SumAlgorithm LIST_DOUBLE_NEG_1_2_3_ALG = new SumAlgorithm();


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
		assertEquals(LIST_DOUBLE_1_2_3_SUM,LIST_DOUBLE_1_2_3_ALG.aggregate());
	}

	@Test
	public void testAggregate_Negative() {
		assertEquals(LIST_DOUBLE_NEG_1_2_3_SUM,LIST_DOUBLE_NEG_1_2_3_ALG.aggregate());
	}

	@Test
	public void testAppendDouble_More() {
		LIST_DOUBLE_1_2_3_ALG.append(new Double(4.1));
		assertEquals(new Double(10.1),LIST_DOUBLE_1_2_3_ALG.aggregate());
	}

	@Test
	public void testAppendDouble_Less() {
		LIST_DOUBLE_1_2_3_ALG.append(new Double(-6.5));
		assertEquals(new Double(-0.5),LIST_DOUBLE_1_2_3_ALG.aggregate());
	}

	@Test
	public void testAppendListOfDouble() {
		LIST_DOUBLE_NEG_1_2_3_ALG.append(TestData.LIST_DOUBLE_1_2_3);
		assertEquals(new Double(0.0),LIST_DOUBLE_NEG_1_2_3_ALG.aggregate());
	}

}
