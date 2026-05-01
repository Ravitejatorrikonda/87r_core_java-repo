package com.conditional.statements;

/**
 * Ladder if:-
 * ----------
 * it is a short replacement of if else, it is alo used to control the flow of 
 * execution
 * 
 * if(Condition){}
 * else if(condition){}
 * else{}
 * 
 * write a java program to find the student grade
 * if student marks 
 * 100 to 90 grade will be A
 * 80 to 90->grade B
 * 70 to 80->grade C
 * 60 to 70 ->grade D
 * below 60->grade Fails
 * 
 */

public class Example3 {
       public void print(int marks) {
    	   if(marks <= 100 && marks >90) {
    		 System.out.println("Grade A");
    	   }else if(marks <= 90 && marks >80) {
    		   System.out.println("Grade B");
    	   }else if(marks <= 80 && marks > 70) {
    		   System.out.println("Grade C");
    	   }else if(marks <= 70 && marks >60) {
    		   System.out.println("Grade D");
    	   }else if(marks <= 60 && marks >= 0){
    		   System.out.println("Fails");
    	   }else {
    		   System.out.println("Invalid");
    	   }
       }
       
       /**
        * 
        * Write a java program to increase the salary based on exp and rating
        * if exp 5 above and rating 8 above->salary inc->50%
        * exp 3 to 5 and rating 5 to 8->salary inc->30%
        * exp 1 to 3 and rating 3 to 5->salary 10%
        * 
        *                  0.3*salary
        * 
        */
       
       public double display(int exp, int rating, double salary) {
    	   if((exp > 5)&&(rating > 8)) {
    		   return 0.5*salary;
    	   }else if((exp > 3 && exp <= 5)&&(rating >5 && rating <=8 )) {
    		   return 0.3*salary;
    	   }else if((exp > 1&& exp <=3)&& (rating >3 && rating <= 5)) {
    		   return 0.10* salary;
    	   }else {
    		   return 0.0;
    	   }
       }
       
       
	
	
	public static void main(String[] args) {
	          Example3 obj=new Example3();
//	          obj.print(110);
//	          System.out.println(obj.display(0, 7, 50000.0));
	          int a=30;
	          int b=40;
	          if(a>b) {
	        	  System.out.println("A is Big");
	          }else {
	        	  if(a<b) {
	        		  System.out.println("B is Big");
	        	  }else {
	        		  System.out.println("Both are equal");
	        	  }
	          }
	          

	}

}
