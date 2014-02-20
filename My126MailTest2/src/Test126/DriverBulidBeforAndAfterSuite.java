package Test126;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import bin.BrowersSize;


public class DriverBulidBeforAndAfterSuite {
	//定义dirver
	protected  static WebDriver ffwb = null;
	//定义firefox配置变量
	private FirefoxProfile firefoxProfile =null;
	//获取本项目工作目录
	private String propath=System.getProperty("user.dir");
	private int h;
	private int w;
	//定义数据文档
	

	@BeforeSuite
	public  void driverBulid() {
		System.out.println(propath);
		File firebug= new File(propath+"/tool/firebug@software.joehewitt.com.xpi");
		File firepath=new File(propath+"/tool/FireXPath@pierre.tholence.com.xpi");
		
	
		firefoxProfile=new FirefoxProfile();
		System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
	
		try {
			firefoxProfile.addExtension(firebug);
			firefoxProfile.addExtension(firepath);
			//firefoxProfile.setPreference("webdriver.accept.untrusted.certs", "true"); 
			firefoxProfile.setPreference("extensions.firebug.currentVersion", "1.12.6");
			
		
			
			ffwb=new FirefoxDriver(firefoxProfile);
			ffwb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			BrowersSize bs=new BrowersSize();
			h= (int)bs.getScreenDims().getHeight();
			w= (int)bs.getScreenDims().getWidth();
			bs.getScreenDims().getWidth();
			Dimension Ds=new Dimension(w, h);
			
			ffwb.manage().window().setSize(Ds);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void driverStop(){
		ffwb.close();
	}
	
	@Test
	public void testStart(){
		ffwb.get("http://www.baidu.com");

		System.out.println("fuck!");
	}
	
}
