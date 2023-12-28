package javaPrograms;

public class P9OverLoading {
	
	
	public static void sum(int a, int b) {
		
		int result = a+b;
		System.out.println(result);
	
	}
	
	public static void sum(String a, String b) {
		
		String result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(100,23);
		sum("Selenium", " testing");
	
		

	}

}
