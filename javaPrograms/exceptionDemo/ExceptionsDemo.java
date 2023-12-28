package exceptionDemo;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		   try {
		   	// write the risky code
		   	int i = 9/0;
		   	
		   }
				catch(ArithmeticException e) {
				
					// e.printStackTrace(); //prints exception, description and line number
					//System.out.println(e.toString()); ////prints exception, description
					
					System.out.println(e.getMessage()); // prints description
					
					// give the alternative working code
					System.out.println("Executed Alternate code");
					int i = 9/3;
					System.out.println(i);
					
				}
		  
			
		   try {
		   	// write the risky code
		   	String s1 = null;
		   	s1.length();
		   	
		   }
				catch(Exception e) {
				
					 e.printStackTrace(); //prints exception, description and line number
					//System.out.println(e.toString()); ////prints exception, description
					
					//System.out.println(e.getMessage()); // prints description
					
					// give the alternative working code
					System.out.println("Executed Alternate code");
					
					
				}		
				
			}
		}

