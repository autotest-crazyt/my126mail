package Test126;

import java.util.Date;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SendPageWorkers extends LoginAndLogOut126BeforAndAfterTest{
	private int i;
	@Test
	public void sendMail(){
		for( i=0;i<20;i++){
			
		
		//点击写信按钮
		(new WebDriverWait(ffwb,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[last()]/span[@class='kT']")));
		
		ffwb.findElement(By.xpath("//li[last()]/span[@class='kT']")).click();
		//等待写信页面加载
		(new WebDriverWait(ffwb,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='nui-editableAddr-ipt']")));
		
		SendPage sendpage= new SendPage(ffwb);
		sendpage.setShouJianRen("crazytest001@126.com")
		.setZhuTi(new Date().toString()+"主题"+i)
		.setNeiRong("这是一封测试邮件，发件时间为"+(new Date()).toString())
		.send();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		(new WebDriverWait(ffwb,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='spanComposeSuccInfo']/text()")));
//		System.out.println(ffwb.findElement(By.xpath("//span[@id='spanComposeSuccInfo']/text()")));
//		Assert.assertEquals("发送成功", ffwb.findElement(By.xpath("//span[@id='spanComposeSuccInfo']")).getText());
	
		}
	}

}
