package com.jesslilly.aggalg;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MedianAlgorithmTest {

	public final static MedianAlgorithm LIST_DOUBLE_1_2_3_ALG = new MedianAlgorithm();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		LIST_DOUBLE_1_2_3_ALG.initialize(TestData.LIST_DOUBLE_1_2_3);
	}

	@After
	public void tearDown() throws Exception {
	}

	// This will also test the case of an even number of elements.
	@Test
	public void testAppendDouble() {
		LIST_DOUBLE_1_2_3_ALG.append(new Double(4.0));
		assertEquals(new Double(2.5),LIST_DOUBLE_1_2_3_ALG.aggregate());
	}

	@Test
	public void testAppendListOfDouble() {
		LIST_DOUBLE_1_2_3_ALG.append(TestData.LIST_DOUBLE_NEG_1_2_3);
		assertEquals(new Double(0),LIST_DOUBLE_1_2_3_ALG.aggregate());
	}

	// This will also test the case of an odd number of elements.
	@Test
	public void testAggregate() {
		assertEquals(new Double(2.0),LIST_DOUBLE_1_2_3_ALG.aggregate());
	}

}
