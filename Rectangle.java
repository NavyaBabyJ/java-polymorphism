package com.nissan.model;

public class Rectangle extends Shape{
	public double length;
    public double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double Area() {
        return length * width;
    }
	

}
