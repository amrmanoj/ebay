package pages;



import base.Base;

public class HomePage extends Base
{
   	public String getTitle()
	{
		String title=driver.getTitle();
		return title;
	}
}
