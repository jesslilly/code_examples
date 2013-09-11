package com.jesslilly.junit_param_test;

import java.util.ArrayList;
import java.util.Collection;

public class DataFileTestData implements SpecialNamedFile {
	private DataFile testObject;
	private String dataType;
	private String itemNumber;
	private String author;
	private String code;

	public DataFileTestData(DataFile testObject, String itemNumber,
			String author, String code, String dataType) {
		super();
		this.testObject = testObject;
		this.dataType = dataType;
		this.itemNumber = itemNumber;
		this.author = author;
		this.code = code;
	}

	public DataFile getTestObject() {
		return testObject;
	}

	public String getDataType() {
		return dataType;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public String getAuthor() {
		return author;
	}

	public String getCode() {
		return code;
	}

	public static Collection<Object[]> getTestData() throws Exception {

		// I had to wrap these objects in an array.
		// createInputValues() must return a Collection
		// of arrays.

		ArrayList<Object[]> input = new ArrayList<Object[]>(3);

		input.add(new Object[] { new DataFileTestData(new DataFile(
				"DATAFILE.P123.jmlilly.ABC2_X.xls"), "P123", "jmlilly", "ABC2",
				"xls") });
		input.add(new Object[] { new DataFileTestData(new DataFile(
				"DATAFILE.iPhone5S.asmith.EBC3_X.docx"), "iPhone5S", "asmith", "EBC3",
				"docx") });
		input.add(new Object[] { new DataFileTestData(new DataFile(
				"DATAFILE.9348726.JKUMAR.1234.html"), "9348726", "JKUMAR", null,
				"html") });
		input.add(new Object[] { new DataFileTestData(new DataFile(
				"/some/dir/with.dot/DATAFILE.8500B.zfeng.zeb2.zip"), "8500B", "zfeng", "zeb2",
				"zip") });
		return input;
	}
}