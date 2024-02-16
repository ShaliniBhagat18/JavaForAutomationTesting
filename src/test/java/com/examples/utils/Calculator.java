package com.examples.utils;

import com.Emaples.geomerty.Circle;
import com.Emaples.geomerty.Rectangle;

public class Calculator {

	public static void main(String[] args) {
		Circle cir = new Circle(5.0);
		Rectangle rec = new Rectangle(12, 34);

		double circleArea = Math.PI * Math.pow(cir.radius, 2);
		double circleAreaWithRound = Math.round(circleArea);
		double rectArea = rec.breadth * rec.lenght;
		System.out.println("Area of circle is %f " + circleAreaWithRound + " Area of rectangle is %f " + rectArea);
	}

}
