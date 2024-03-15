package com.collectionsExamples;

public class CheckingSpecificData {
	
	public static void main(String arges[]) {
		
		CheckingSpecificData obj = new CheckingSpecificData();
		myModuleName("CHT12");
	}
	
	public static String myModuleName(String module) {
		String [] module_list = {"Top10", "CHT", "Catalyst", "Secure"};
		for(int i=0; i<module_list.length; i++) {
			if(module==module_list[i]) {
				System.out.println("Click on the banner");
				System.out.println("Check the Header");
			}
			
		}
		System.out.println("Do not matching !!");
		
		return module;
		
	}

}
