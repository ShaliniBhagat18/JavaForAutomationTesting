package com.java.practice_Examples;

public class GCDUsingForLoop {

	public static void main(String[] args) {
       int firstNo = 12;
       int secondNo = 15;
       int gcd;
       
     for(int i=2; i<=firstNo; i++) {
    	 if(firstNo%i==0 && secondNo%i==0) {
    		 gcd=i;
    		 System.out.println("GCD of number is "+gcd);
    	 }
     }
       
	}

}
