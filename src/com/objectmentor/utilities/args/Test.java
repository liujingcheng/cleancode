package com.objectmentor.utilities.args;

public class Test {
	public static void main(String[] args) {
		try {
			Args arg = new Args("l,p#,d*", args);
			boolean logging = arg.getBoolean('l');
			System.out.println("logging=" + logging);
		} catch (Exception e) {
			System.out.printf("Argumenterror:%s\n", e.getMessage());
		}
	}
}
