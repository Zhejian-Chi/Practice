package com.chi;

public class VarialbeArg {
	
	/*
	//normal for-loop
	public static int add(int... x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
	*/
	
	//boosting for-loop
	public static int add(int... xs) {
		int sum = 0;
		for(int x : xs) {
			sum = sum + x;
		}
		return sum;
	}
}
