package com.nissan.model;

public class Square {
	public double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	public double Area() {
        return side * side;
    }

}
