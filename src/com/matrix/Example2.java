package com.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int rows = sc.nextInt();
		System.out.println("Enter the column size : ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter (" + i + "," + j + ") values : ");
				arr[i][j] = sc.nextInt();
			}

		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i==j) {
					System.out.println(arr[i][j]);
				}
			}
			System.out.println();

		}
		System.out.println(sum);

		sc.close();
	}

}
