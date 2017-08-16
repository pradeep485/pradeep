package com.spinsci;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class StringReverseUsingWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string you want to reverse");
		String InputValue =sc.nextLine();
		System.out.println(InputValue);
		//String InputValue = "pradeep is";
		
		//String[] splitedString = InputValue.split(" ");
		/*for(String s:splitedString) {
			System.out.print(new StringBuffer(s).reverse() + " ");
		}*/
		
			/*String[] splitedString = InputValue.split(" ");
			for(String s:splitedString) {
				for(int i= s.length()-1; i>=0; i--) {
					System.out.print(s.charAt(i));
				}
				System.out.print(" ");
		}*/
	}

}
