package jUnitTest1Package;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, testAddNumber.class, testAddNumbers.class })

public class AllTests {

}
