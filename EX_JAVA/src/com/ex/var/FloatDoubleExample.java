package com.ex.var;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수값 저장
		double var1 = 3.14;
//		float var2 = 3.14;	// F붙이지 않으면 컴파일 에러 발생
		float var3 = 3.14F;
		
		// 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var7); // double은 float의 두배
		System.out.println(var8);
		System.out.println(var9);
	}
}
