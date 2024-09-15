package com.jdc.demo;

public class MainApplication {

	public static void main(String[] args) {
		try {
			System.out.println("Start main method");
			var serivce = new Service1();
			serivce.execute(10, 0);
			System.out.println("End main method");
		} catch (Exception e) {
			System.out.println("Handle Exception");
		}
	}
}
