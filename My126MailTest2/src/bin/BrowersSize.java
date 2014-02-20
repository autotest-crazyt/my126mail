package bin;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BrowersSize {
	private  Dimension screenDims;
	private int width;
	private int height;

	public  void maximise(WebDriver driver){
	    
	    final JavascriptExecutor js = (JavascriptExecutor) driver;
	    
//	    js.executeScript("window.open('','testwindow','width=400,height=200')");
//	    
//	    driver.close();
//	    
//	    driver.switchTo().window("testwindow");
	    
	    js.executeScript("window.moveTo(0,0)");
	    
//	    1280和1024分别为窗口的宽和高，可以用下面的代码得到
	    
	   
	    
	    this.width = (int) this.getScreenDims().getWidth();
	    
	    this.height = (int) screenDims.getHeight(); 
	    
	    js.executeScript("window.resizeTo("+this.width+","+this.height+")");
	    
	    System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	    
	    System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
	    
	    }

	public  Dimension getScreenDims() {
		screenDims = Toolkit.getDefaultToolkit().getScreenSize();
		return screenDims;
	}

}
