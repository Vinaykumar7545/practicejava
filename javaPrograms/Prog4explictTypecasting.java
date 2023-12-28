package javaPrograms;

public class Prog4explictTypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 25.862;
		int a = (int)d1;
		System.out.println("the value of d1 is not converted to integer " + a);
		
		int phone = 98763215;
		String phonenumber = Integer.toString(phone);
		System.out.println(phonenumber);
		
		String s2 = String.valueOf(phone);
		System.out.println(s2);
		
		
		String age = "89";
		int i = Integer.parseInt(age);
		System.out.println(i);
	}

}
