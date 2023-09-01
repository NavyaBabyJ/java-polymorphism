package com.nissan.app;

import com.nissan.model.Figure;
import com.nissan.model.Rectangle;
import com.nissan.model.Triangle;

public class FigureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure r=new Rectangle(20,10);
		System.out.println("Area: "+r.Area());
		Figure t=new Triangle(20,10);
		System.out.println("Area: "+t.Area());
	}

}
