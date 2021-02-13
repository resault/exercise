package com.ex.var;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000;	// 컴파일 에러 -> int 저장범위를 넘으면 L 붙여야 함
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
