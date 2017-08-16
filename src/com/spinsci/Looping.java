package com.spinsci;

public class Looping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 0; int B = 2; int loop = 10;
	    int tempAnswer = A;
	    for (int j = 0; j < loop; j++) {
	        tempAnswer += (int) (Math.pow(2.0, j) * B);
	        System.out.print(tempAnswer + " ");
	    }
	}

}
