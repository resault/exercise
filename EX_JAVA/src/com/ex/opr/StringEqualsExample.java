package com.ex.opr;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);		// true: 문자열 리터럴이 동일하므로 주소값이 같음
		System.out.println(strVar1 == strVar3);		// false: 주소값이 다름
		
		System.out.println(strVar1.equals(strVar2));	// true
		System.out.println(strVar1.equals(strVar3));	// true
	}
}
