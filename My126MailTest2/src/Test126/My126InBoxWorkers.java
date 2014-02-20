package Test126;

import org.testng.annotations.Test;

public class My126InBoxWorkers extends LoginAndLogOut126BeforAndAfterTest{
	@Test
	public void allMailReaded(){
		My126InBoxPage inBoxPage=new My126InBoxPage(ffwb);
		inBoxPage.inBoxClick();
		inBoxPage.inBoxBjClick();
		inBoxPage.allSetReadedClick();
		
	}

}
