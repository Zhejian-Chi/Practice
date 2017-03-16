package com.chi;

public class VariableArgTest {
	public static void main(String[] args) {
		int s = 0;
		s = VarialbeArg.add(1);
		System.out.println(s);
		s = VarialbeArg.add(1, 2, 3, 4, 5);
		System.out.println(s);
	}
}
