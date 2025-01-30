package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void CreateContactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println("excute CreateContactTest");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
	}
	
	@Test
	public void ModifyContactTest() {
		System.out.println("excute ModifyContactTest");
	}
	@Test
	public void deleteContactTest() {
		System.out.println("excute deleteContactTest");
	}
	

}
