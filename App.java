package com.nissan.app;

import com.nissan.model.Rectangle;
import com.nissan.model.Shape;
import com.nissan.model.Square;

public class App {
	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Square square = new Square(4.0);

        System.out.println("Area of Rectangle: " + rectangle.Area());
        System.out.println("Area of Square: " + square.Area());
    }
}
 












		
	}

}
