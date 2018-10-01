package com.briup.chap06;
interface Geometry{
	public double setArea();
	
	}
class Pillar {
	Geometry bottom;
	double high;	
	public Pillar(Geometry bottom, double high) {
		super();
		this.bottom = bottom;
		this.high = high;
	}
	public double bulk(){ 
		 double bulk=bottom.setArea()*high;
		 return bulk;		
	}		
	}
class Circle implements Geometry{
	double r;
	public Circle(double r) {
		super();
		this.r = r;
	}		
	public  double setArea(){
		double circle=3.14*r*r;
		System.out.println("圆的面积="+circle);
		return circle;
		}
}
class Rectangle implements Geometry{
	double wide;
	double high;	
	public Rectangle(double wide, double high) {
		super();
		this.wide = wide;
		this.high = high;
	}

	public  double setArea(){
		double rectangle=wide*high;
		System.out.println("矩形面积="+rectangle);
		return rectangle;
		}
	}
class Test{
	public static void main(String[]args){
		Geometry bottom;
		bottom=new Circle(3);
		Pillar p=new Pillar(bottom,4);
		System.out.println("圆形底面的柱体体积="+p.bulk());
		bottom=new Rectangle(3,5);
		Pillar p1=new Pillar(bottom,4);
		System.out.println("矩形底面的柱体体积="+p1.bulk());
		
		}
	}
