package com.arrays.task;

public class Example2 {

	public static void main(String[] args) {
//		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
//		int evencount=0;
//		int oddcount=0;
//		for (int i = 0; i < arr2.length; i++) {
//			if(arr2[i]%2==0) {
//				evencount++;
//			}else {
//				oddcount++;
//			}
//		}
//		
//		System.out.println(evencount);
//		System.out.println(oddcount);
		
		
		
//		
//		int[] arr3= {1,2,3,4,5,6};
//		System.out.println(arr3.length);
//		for (int i = arr3.length-1; i >=0 ; i--) {
//			System.out.println(arr3[i]);
//			
//		}
		
		
		
		int[] arr4= {1,2,3,4,5,6};
		int target=50;
		
		boolean status=true;
		for (int i = 0; i < arr4.length; i++) {
			if(target == arr4[i]) {
				System.out.println("targeted elkement present in the index : "+i);
				status=false;
				break;
			}
		}
		if(status) {
			System.out.println("not found");
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
