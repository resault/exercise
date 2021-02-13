package com.ex.var;

public class FromIntToFloat {

	public static void main(String[] args) {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;	// float의 가수(23bit)보다 큰 값은 손실됨
		num2 = (int) num3;
		
		int result = num1 - num2;
		
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(result);
	}
}
