package com.nissan.model;

public class Triangle extends Figure{
	public Triangle(int dim1,int dim2) {
		super(dim1,dim2);
	}
	
	public int Area() {
		return dim1*dim2/2;
	}

}
