package com.gdcp.po;

public class Circle {
	
	public double radius;
	public double area;
	
	public double getRadius(){
		return radius;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
