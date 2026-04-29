package com.abstraction;


abstract class Area{
	 abstract void  area();
	
//	public  void area() {
//		
//	}
	
}


class AreaCircle extends Area{
	int radius;
	public AreaCircle(int radius) {
		this.radius=radius;
	}

	
	public void area() {
		System.out.println("Area of the Circle : "+ Math.PI *radius*radius);
		
	}

	
	
}
class AreaRectangle extends Area{
   int length;
   int breadth;
   
   
	

	public AreaRectangle(int length, int breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}




	@Override
	public void area() {
		System.out.println("Area of the reactangle : "+ (length * breadth));
		
	}
	
}



public class Test2 {

	public static void main(String[] args) {
		
		Area a;
		
		a=new AreaCircle(20);
		a.area();
		
		
		a=new AreaRectangle(30, 20);
		a.area();
		
		
//		Area a=new AreaCircle(20);
//		a.area();

	}

}
