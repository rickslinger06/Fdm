package com.fdmgroup.loops;

public class FindingCity {

	public static void main(String[] args) {
		
		char firstletter = 'B';
		
		String [] Cities = {"Glasgow","London","Birmingham","Cardiff","Manchester","Newcastle"};
		
		for(String city : Cities) {
			if(city.charAt(0) == firstletter){
				System.out.println(city + " -Matched");
				
			}else {
				System.out.println(city + " -Doesnt Matched");
			}
			
			
			}
		}

	}


