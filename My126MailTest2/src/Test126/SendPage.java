package Test126;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendPage {
	private WebDriver driver;
	@FindBy(xpath="//input[contains(@aria-label,'收件人')]")
	private WebElement shouJianRen;
	
	@FindBy(xpath="//input[@id='objComposeSubject']")
	private WebElement zhuTi;
	
	@FindBy(xpath="//iframe[@class='APP-editor-iframe']")
	private WebElement zhengWen;
	
	@FindBy(xpath="//body")
	private WebElement neiRong;
	
	@FindBy(xpath="//div[@tabindex='0']/span[contains(text(),'发 送')]")
	private WebElement sendButton;

	public SendPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}

	public SendPage setShouJianRen(String shouJianRen) {
//		this.shouJianRen.clear();
		this.shouJianRen.sendKeys(shouJianRen);
		return this;
	}

	public SendPage setZhuTi(String zhuTi) {
//		this.zhuTi.clear();
		this.zhuTi.sendKeys(zhuTi);
		return this;
	}

	public SendPage setNeiRong(String neiRong) {
		this.driver.switchTo().frame(this.zhengWen);
//		this.neiRong.clear();
		this.neiRong.sendKeys(neiRong);
		this.driver.switchTo().defaultContent();
		return this;
	}
	
	public SendPage send(){
		this.sendButton.click();
		return this;
	}
	
	
}
