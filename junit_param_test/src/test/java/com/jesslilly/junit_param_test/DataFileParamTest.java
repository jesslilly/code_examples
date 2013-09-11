package com.jesslilly.junit_param_test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

// See http://techinsides.blogspot.com/2010/08/dont-repeat-yourself-junit-4s.html
@RunWith(Parameterized.class)
public class DataFileParamTest {
	
	private static DataFileTestData testData;
	private static DataFile testObject;
	
	public DataFileParamTest(DataFileTestData testData) {
		super();
		DataFileParamTest.testData = testData;
	}

	@Before
	public void setUp() throws Exception {
		testObject = testData.getTestObject();
	}
	
	@Parameters
	public static Collection<Object[]> createInputValues() throws Exception {
		return DataFileTestData.getTestData();
	}

	// TODO: It would be cool to use reflection to call all of these.
	@Test
	public void testGetDataType() {
		assertEquals(testData.getDataType(),testObject.getDataType());
	}

	@Test
	public void testGetItemNumber() {
		assertEquals(testData.getItemNumber(),testObject.getItemNumber());
	}

	@Test
	public void testGetCode() {
		assertEquals(testData.getCode(),testObject.getCode());
	}

	@Test
	public void testGetAuthor() {
		assertEquals(testData.getAuthor(),testObject.getAuthor());
	}


}
