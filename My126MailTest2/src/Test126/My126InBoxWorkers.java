package Test126;

import org.testng.annotations.Test;

public class My126InBoxWorkers extends LoginAndLogOut126BeforAndAfterTest{
	My126InBoxPage inBoxPage=new My126InBoxPage(ffwb);
	@Test//全部标记为已读
	public void allMailReaded(){
		
		this.inBoxPage.inBoxClick();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.inBoxPage.inBoxRightClick();
		this.inBoxPage.allSetReadedClick();
		
	}
	
//	@Test
//	public void 
	
	

}
