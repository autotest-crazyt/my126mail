package Test126;

import org.testng.annotations.Test;

public class My126InBoxWorkers extends LoginAndLogOut126BeforAndAfterTest{
	My126InBoxPage inBoxPage=new My126InBoxPage(ffwb);
	@Test//ȫ�����Ϊ�Ѷ�
	public void allMailReaded(){
		
		inBoxPage.inBoxClick();
		inBoxPage.inBoxRightClick();
		inBoxPage.allSetReadedClick();
		
	}
	
//	@Test
//	public void 
	
	

}
