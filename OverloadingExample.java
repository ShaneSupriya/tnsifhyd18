package com.si.sample;

public class OverloadingExample {
	int a=30;
	void display(int b)
	{
		System.out.println("The value of b is"+b);
	}
	
	
	static void display(String s,String n)
	{
		System.out.println("my name is "+s);
		System.out.println("and my friend name is"+n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample obj= new OverloadingExample();
		obj.display(80);
		System.out.println(obj.a);
		display("Supriya","Sneha");

	}

}
