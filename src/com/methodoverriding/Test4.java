package com.methodoverriding;

import javax.xml.xpath.XPath;

class Xparent{
	public Object getNumber() {
		return 30;
	}
	
}
class Yparent extends Xparent{
	public Number getNumber() {
		return 100;
	}
}
class Zparent extends Yparent{
//  public Short getNumber() {
//	  return 300;
//  }
}

public class Test4 {

	public static void main(String[] args) {
		Xparent obj=new Zparent();
		      Short s =(Short)obj.getNumber();
		      System.out.println(s);
		

	}

}
