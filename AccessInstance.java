package com.si.sample;

public class AccessInstance {
	

	public static void main(String[] args) {
		Parent c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.res);
		c1.display();

	}

}
