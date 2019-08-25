package com.bmg;

class Point{
	double x,y;
	
	public Point(double _x,double _y){
		x = _x;
		y = _y;
	}
	
	public double getPoint(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
	}
}

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(3.0, 4.0);
		Point orige = new Point(0.0,0.0);
		System.out.println(p1.getPoint(orige));
	}
}
