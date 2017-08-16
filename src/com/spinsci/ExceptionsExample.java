package com.spinsci;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * sample inputs: x = 10, y = 3 output : 3
 * sample inputs: x = 10, y = Hello  output : java.util.InputMismatchException
 * sample inputs: x = 10, y = 0 output : java.lang.ArithmeticException: / by zero
 * sample inputs: x = 23.23, y = 0 output : java.util.InputMismatchException
 */

public class ExceptionsExample {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the x, y values");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y== 0) {
				throw new ArithmeticException("/ by zero");
			}else {
				System.out.println(x/y);
			}
				
		}catch(InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
