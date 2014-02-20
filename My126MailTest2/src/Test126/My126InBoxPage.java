package Test126;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bin.MouseAction;

public class My126InBoxPage {
	private WebDriver driver;
	
	@FindBy(xpath="//div[@id='_mail_component_2_2']/span")
	private WebElement inBox;
	
	@FindBy(xpath="//li[contains(@title,'�ռ���')]")
	private WebElement inBoxTab;
	
	@FindBy(xpath="//li[contains(@title,'�ռ���') and @aria-selected='true']")
	private WebElement inBoxTabAriaValue;
	
	
	@FindBy(xpath="//div[@id='_dvModuleContainer_mbox.ListModule_0']/descendant::span[contains(text(),'���Ϊ')]")
	private WebElement inBoxBj;
	
	@FindBy(xpath="//div[@id='_mail_menu_65_384']/descendant::span[contains(text(),'ȫ��')]")
	private WebElement allSetReaded;
	
	//�ʼ��б�
	@FindBy(xpath="//div[contains(@class,'nui-txt-flag0')]")
	private WebElement[] Whetherreaded;
	
	public My126InBoxPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void inBoxClick(){
		System.out.println("123123");
		
		this.inBox.click();
		try {
			System.out.println("aaaa");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//(new WebDriverWait(this.driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@title,'�ռ���')]")));
		//(new WebDriverWait(this.driver,10)).until(ExpectedConditions.elementSelectionStateToBe(inBoxTab, this.inBoxTab.getAttribute("aria-selected").contains("true")));
//		
//		(new WebDriverWait(this.driver,10)).until(ExpectedConditions.elementToBeClickable(this.inBoxTabAriaValue));
//		(new WebDriverWait(this.driver,10)).until(ExpectedConditions.elementToBeClickable(this.inBoxBj));
	}
	
	public void inBoxRightClick(){
		MouseAction ma=new MouseAction();
		ma.mouseRightclickContext(this.driver, this.inBox);
		new WebDriverWait(this.driver,5).until(ExpectedConditions.elementToBeClickable(this.allSetReaded));
		
	}
	
	public void inBoxBjClick(){
		this.inBoxBj.click();
		(new WebDriverWait(this.driver,10)).until(ExpectedConditions.elementToBeClickable(allSetReaded));
	}
	
	public void allSetReadedClick(){
		this.allSetReaded.click();
//		for (WebElement i : Whetherreaded){
//			
//				System.out.println(i+"���ʼ��Ѷ�");
//			
//		}
	}
	

}
