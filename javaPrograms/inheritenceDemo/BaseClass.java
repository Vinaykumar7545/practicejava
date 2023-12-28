package inheritenceDemo;

public class BaseClass {

	public static void openbrowser(String browserName,String appURL)
	{
		System.out.println("Code to open the browser for testing in : " + browserName);
		System.out.println("Code to open the app on the browser for testing in : " + appURL);
		
	}
	
	public static void login(String userName, String password)
	{
		System.out.println("Code for username "+ userName);
		System.out.println("code for password" + password);
		System.out.println("User logged successfully");
	}
		   
	
	
	
	
	
}
