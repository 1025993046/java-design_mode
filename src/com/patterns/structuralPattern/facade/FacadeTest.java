package com.patterns.structuralPattern.facade;

public class FacadeTest {
	public static void main(String[] args) {
		Mainframe mainframe = new Mainframe();
		mainframe.on();
		
		System.out.println("----------------------");
		
		mainframe.off();
	}
}
