package com.ex.opr;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		
		System.out.println(strVar1 == strVar2);		// true: ���ڿ� ���ͷ��� �����ϹǷ� �ּҰ��� ����
		System.out.println(strVar1 == strVar3);		// false: �ּҰ��� �ٸ�
		
		System.out.println(strVar1.equals(strVar2));	// true
		System.out.println(strVar1.equals(strVar3));	// true
	}
}
