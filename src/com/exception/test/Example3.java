package com.exception.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an arr :");
		try {

			int[] arr = new int[sc.nextInt()];
//			System.out.println("Hello There");
			System.out.println(arr[100]);

		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Hello There");

	}

}
