package Test126;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class LoginAndLogOut126BeforAndAfterTest extends DriverBulidBeforAndAfterSuite{
	@BeforeTest
	public void login(){
		ffwb.get("http://www.126.com");
		ffwb.findElement(By.xpath("//input[@id='idInput']")).clear();
		ffwb.findElement(By.xpath("//input[@id='idInput']")).sendKeys("crazytest001");
		ffwb.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("abc,123");
		ffwb.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		(new WebDriverWait(ffwb,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='spnUid']")));
		System.out.println("1");
		Assert.assertEquals(ffwb.findElement(By.xpath("//span[@id='spnUid']")).getText(),"crazytest001@126.com");
	}
	
	@AfterTest
	public void logOut126(){
		ffwb.findElement(By.xpath("//a[contains(text(),'ÍË³ö')]")).click();
	}
		
}
