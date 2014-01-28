package practiceone;

import org.testng.annotations.*;


public class PracticeBase {
    @BeforeTest
    public void beforeTest(){
    	System.out.println("beforeTestbase1");
    }
    
    @AfterTest
    public void afterTest(){
    	System.out.println("afterTestbase1");
    }
    
    @BeforeSuite
    public void beforeSuite(){
    	System.out.println("beforeSuitebase1");
    }
    
    @AfterSuite
    public void afterSuite(){
    	System.out.println("afterSuitebase1");
    }
    
    
    @Test
    public void runAll(){
    	System.out.println("Run all test casesbase1");
    }
    
}
