package Test126;

import org.testng.annotations.Test;

public class My126InBoxWorkers extends LoginAndLogOut126BeforAndAfterTest{
	My126InBoxPage inBoxPage=new My126InBoxPage(ffwb);
	@Test//全部标记为已读
	public void allMailReaded(){
		
		inBoxPage.inBoxClick();
		inBoxPage.inBoxRightClick();
		inBoxPage.allSetReadedClick();
		
	}
	
//	@Test
//	public void 
	
	

}
