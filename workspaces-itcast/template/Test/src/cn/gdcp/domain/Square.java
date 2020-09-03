package cn.gdcp.domain;

public class Square {

	private double length;
	
	public Square() {}
	public Square(double length) {
		super();
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea(double length) {
		return length * length;
	}

}
