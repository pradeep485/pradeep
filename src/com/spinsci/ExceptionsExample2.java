package com.spinsci;

import java.util.Scanner;

public class ExceptionsExample2 {

	/*public static long power(int n, int p)throws Exception {
	
    		if(n == 0 && p == 0) {
    			throw new Exception("n and p should not be zero.");
    		}else if(n<0 && p <0) {
    			throw new Exception("n or p should not be negative.");
    		}else if(n < 0 || p < 0) {
    			throw new Exception(" n or p should not be negative.");
    		}else {
    			  return (long)Math.pow(n, p);
    			
    			
    		}
    		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n and p values");
		int n = sc.nextInt();
		int p = sc.nextInt();
		try {
		System.out.println(power(n, p));
		}catch (Exception e) {
			System.out.println(e);
		}
    
	}*/
	
	public static final MyCalc myCalc = new MyCalc();
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the values of n, p");
		while(in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			try {
				System.out.println(myCalc.power(n, p));
			}catch(Exception e) {
				
			}
		}
	}
   
}
class MyCalc {
	long power(int n, int p) throws Exception {
		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}else if(n<0 && p <0) {
			throw new Exception("n or p should not be negative.");
		}else if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else {
        return (long) Math.pow(n, p);
    }
	}
}
