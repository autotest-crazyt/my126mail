package practiceone;

import org.testng.annotations.*;


public class PracticeBase {
    @BeforeTest
    public void beforeTest(){
    	System.out.println("beforeTestbase");
    }
    
    @AfterTest
    public void afterTest(){
    	System.out.println("afterTestbase");
    }
    
    @BeforeSuite
    public void beforeSuite(){
    	System.out.println("beforeSuitebase");
    }
    
    @AfterSuite
    public void afterSuite(){
    	System.out.println("afterSuitebase");
    }
    
    
    @Test
    public void runAll(){
    	System.out.println("Run all test casesbase");
    }
    
}
