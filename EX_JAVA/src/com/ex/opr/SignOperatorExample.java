package com.ex.opr;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		int x = 100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1=" + result1);	// 100
		System.out.println("result2=" + result2);	// -100
		
		
		short s = 100;
//		short result3 = -s;		// ��ȣ ������ ����Ÿ���� int
		int result3 = -s;	//-100
		
		System.out.println("result3=" + result3);
		
	}
}
