package Test126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My126InBoxPage {
	private WebDriver driver;
	
	@FindBy(xpath="//span[@title='收件箱']")
	private WebElement inBox;
	
	@FindBy(xpath="//li[contains(@title,'收件箱')]")
	private WebElement inBoxTab;
	
	@FindBy(xpath="//li[contains(@title,'收件箱')]/@aria-selected")
	private WebElement inBoxTabAriaValue;
	
	
	@FindBy(xpath="//div[@style='']/descendant::span[contains(text(),'标记为')]")
	private WebElement inBoxBj;
	
	@FindBy(xpath="//span[contains(text(),'全部设为')]")
	private WebElement allSetReaded;
	
	//邮件列表
	@FindBy(xpath="//div[contains(@class,'nui-txt-flag0')]")
	private WebElement[] Whetherreaded;
	
	public My126InBoxPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void inBoxClick(){
		this.inBox.click();
		//(new WebDriverWait(this.driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@title,'收件箱')]")));
		//(new WebDriverWait(this.driver,10)).until(ExpectedConditions.elementSelectionStateToBe(inBoxTab, this.inBoxTab.getAttribute("aria-selected").contains("true")));
		(new WebDriverWait(this.driver,10)).until(ExpectedConditions.textToBePresentInElementValue(inBoxTabAriaValue, "true"));
	}
	
	public void inBoxBjClick(){
		this.inBoxBj.click();
		(new WebDriverWait(this.driver,10)).until(ExpectedConditions.elementToBeClickable(allSetReaded));
	}
	
	public void allSetReadedClick(){
		this.allSetReaded.click();
		for (WebElement i : Whetherreaded){
			if(i.getAttribute("class").contains("true")){
				System.out.println("该邮件已读");
			}
		}
	}
	

}
