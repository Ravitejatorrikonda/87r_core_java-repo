package com.matrix;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int [][] a= {
				{1,0,1},{0,1,0},{0,0,1}
		};
		int b=a[0][0];
		boolean status=true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i !=j) {
					if(a[i][j]!=0) {
						status=false;
						break;
					}
				}else {
					if(a[i][j]!=b) {
						status =false;
						break;
					}
				}
			}
		}
		
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if(i != j) {
//					if(a[i][j] != b) {
//						status=false;
//						break;
//					}
//				}
//			}
//		}
		if(status) {
			System.out.println("It is a scalar matrix");
		}else {
			System.out.println("it is not a scalar matrix ");
		}

	}

}
