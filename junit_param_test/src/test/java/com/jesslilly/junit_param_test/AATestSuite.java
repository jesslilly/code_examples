package com.jesslilly.junit_param_test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author jmlilly
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ DataFileParamTest.class, SimpleGreetingParamTest.class, })
public class AATestSuite {
}
