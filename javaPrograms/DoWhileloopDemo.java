package javaPrograms;

public class DoWhileloopDemo {

	public static void main(String[] args) {
		int i = 1;
		do {
	
			// write the code to be looped/repeated  ==>loop block
			System.out.println(" the value of i is : " + i);  // print 1
			i++; // i = 2
		} while(i<=10);  // if condition satisfied go in the loop block again
		
		System.out.println("out of the loop , value of i is grater than 10");

	}

}
