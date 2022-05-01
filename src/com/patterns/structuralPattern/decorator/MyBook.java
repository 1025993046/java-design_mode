package com.patterns.structuralPattern.decorator;

public class MyBook implements Book{
	@Override
	public void borrowBook() {
		System.out.println("借到了一本书！");
	}
}
