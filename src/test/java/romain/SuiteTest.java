package romain;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Romain Test Suite")
@SelectPackages("romain")
@IncludeClassNamePatterns(".*Test")
public class SuiteTest {
}
