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
			
		
		//���д�Ű�ť
		(new WebDriverWait(ffwb,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[last()]/span[@class='kT']")));
		
		ffwb.findElement(By.xpath("//li[last()]/span[@class='kT']")).click();
		//�ȴ�д��ҳ�����
		(new WebDriverWait(ffwb,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='nui-editableAddr-ipt']")));
		
		SendPage sendpage= new SendPage(ffwb);
		sendpage.setShouJianRen("crazytest001@126.com")
		.setZhuTi(new Date().toString()+"����"+i)
		.setNeiRong("����һ������ʼ�������ʱ��Ϊ"+(new Date()).toString())
		.send();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		(new WebDriverWait(ffwb,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='spanComposeSuccInfo']/text()")));
//		System.out.println(ffwb.findElement(By.xpath("//span[@id='spanComposeSuccInfo']/text()")));
//		Assert.assertEquals("���ͳɹ�", ffwb.findElement(By.xpath("//span[@id='spanComposeSuccInfo']")).getText());
	
		}
	}

}
