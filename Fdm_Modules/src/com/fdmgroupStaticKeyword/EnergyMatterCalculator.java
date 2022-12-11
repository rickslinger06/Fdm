package com.fdmgroupStaticKeyword;

public class EnergyMatterCalculator {
	
	public static double SPEED_OF_LIGHT = 299792458;
	
		public static void matterToEnergy(double mass) {
			double result = mass * (SPEED_OF_LIGHT * SPEED_OF_LIGHT);
			System.out.println(result);
		}
		
		public static void energyToMatter(double energy) {
			double result = energy * (SPEED_OF_LIGHT * SPEED_OF_LIGHT);
			System.out.println(result);
		}
	}
	