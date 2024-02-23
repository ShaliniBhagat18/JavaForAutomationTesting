package com.arrayExamples;

public class SampleProgram {

	public static void main(String[] args) {

		// First type to define array
		int[] sampleArray = new int[5];
		sampleArray[0] = 23;
		sampleArray[1] = 50;
		sampleArray[2] = 26;
		sampleArray[3] = 28;
		sampleArray[4] = 20;
		
		System.out.println(sampleArray.length);
		
		// Second type to define array
		
		int[] sampleArray2 = {23, 34, 56, 45, 78};
		System.out.println(sampleArray2.length);
		
		//How to traverse array elements
		System.out.println("Using for loop !!");
		for(int i=0; i<sampleArray2.length; i++) {
			System.out.println(sampleArray2[i]);
		}
		
		//2nd way
		System.out.println("Using for each loop !!");
		for(int myArray:sampleArray2) {
			System.out.println(myArray);
		}
	}

}
