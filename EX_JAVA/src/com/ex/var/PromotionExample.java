package com.ex.var;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
//		char charValue = byteValue;	//	char���� ������ ������ �� ���⿡ �����Ͽ��� �߻�
		char charValue = (char) byteValue;
		int intValue = byteValue;	// int <- byte
		
		System.out.println(intValue);
		
		
		charValue = '��';
		intValue = charValue;	// int <- char
		
		System.out.println("���� �����ڵ�: " + intValue);
		
		
		intValue = 500;
		long longValue = intValue;	// long <- int
		
		System.out.println(longValue);
		
		
		intValue = 200;
		double doubleValue = intValue;	// double <- int
		
		System.out.println(doubleValue);
	}
}
