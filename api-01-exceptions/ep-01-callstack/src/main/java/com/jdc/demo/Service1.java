package com.jdc.demo;

public class Service1 {

	private Service2 serivce = new Service2();
	
	public void execute(int a, int b) {
		try {
			System.out.println("Execute Service 1");
			serivce.execute(a, b);
			System.out.println("Finish Service 1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handle ArrayIndexOutOfBoundsException");
		}
	}

}
