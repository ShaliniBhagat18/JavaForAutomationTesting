package com.java.practice_Examples;

public class PrimeNumberUsingForLoop {

	public static void main(String[] args) {
		int num = 3;
       for(int i=2; i<num; i++) { 
    	   if(num % i == 0) {
    		   System.out.println("Given number is Prime !!");
    		   break;
    	   }else {
    		   System.out.println("Given number is not Prime !!");
    	   }
       }
	}

}
