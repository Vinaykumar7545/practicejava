package javaPrograms;

public class prog5UserdefinedMethod {
	
	public int sum()
	{
		int a = 10;  
		// these variables are inside a method ==> there scope is to be used with in this method= Local variables
		int b = 20;
		
		int result = a+b;  // 10+20 ==> result = 30
		
		// this method should return the result
		
		return result;
		
	}
	
	public int mul()
	{
		int a = 100;  // local variable
		int b = 200;
		int result = a * b;
	    return result;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an object for this class
		
	// Classnmae objectname = new Classname();
		
		prog5UserdefinedMethod	 obj =  new prog5UserdefinedMethodd();
		
	// uSing this object we can call the methods
		
	// syntax : obj.methodname();

		// method 1:
	int sum = obj.sum(); // this method return a int value, so we will store output in a integer variable
		
	int finalresult = sum + 1000;
	
		System.out.println("the final sum is " + finalresult);
	
		// method 2:
		
		// you can directly print the objectname.methodname()
		
		System.out.println("the multiplication output is :" + obj.mul()); // the result of the method will be printing
		
		// use any one of the methods to print the output of the method

	}

}
