package javaPrograms;

public class P8ParametrizationMethods {
	public static void openbrowser()
	{
		String browserName = "Chrome";
		String appURL = "Google.com";
		System.out.println("Open the browser for testing in : " + browserName);
		System.out.println("Code to open the app on the browser for testing in : " + appURL);

		
	}
	public void login()
	{
		String userName = "Vinay";
		String password = "pass@123";
		System.out.println("Code for username "+ userName);
		System.out.println("Code for password "+ password);
		System.out.println("User logged successfully");
	}

	public static void main (String[] args) {
		P8ParametrizationMethods obj = new P8ParametrizationMethods();
		
		openbrowser();
		obj.login();
		
	}
}
