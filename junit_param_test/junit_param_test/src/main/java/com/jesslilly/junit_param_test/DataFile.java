/**
 * 
 */
package com.jesslilly.junit_param_test;

import java.io.File;

/**
 * @author jmlilly
 * 
 */
public class DataFile extends File implements SpecialNamedFile {

	private static final long serialVersionUID = 9153117202068695265L;
	public static final String DATA_CODE_REGEX = "^[A-Za-z]{3}[A-Za-z0-9]$";

	public DataFile(String pathname) throws Exception {
		super(pathname);
		if (!this.getName().matches("^DATAFILE\\..*\\..*\\..*\\..*$")) {
			throw new Exception(
					"Data files must have a name like"
							+ "DATAFILE.ITEM.AUTHOR.CODE.TYPE");
		}
	}

	public String getItemNumber() {
		return getNameSubstring(1);
	}

	public String getAuthor() {
		return getNameSubstring(2);
	}

	public String getCode() {
		String code = getNameSubstring(3).replaceFirst("_X", "");
		if (!code.matches(DATA_CODE_REGEX))
			code = null;
		return code;
	}

	public String getDataType() {
		return getNameSubstring(4);
	}

	private String getNameSubstring(int position) {
		return this.getName().split("\\.")[position];
	}
}
