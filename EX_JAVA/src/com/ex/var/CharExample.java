package com.ex.var;

public class CharExample {

	public static void main(String[] args) {
		
		// Unicode: 0~65535, 2byte
		
		char c1 = 'A';
		char c2 = 65;			// 10����
		char c3 = '\u0041';		// 16����
		
		char c4 = '��';
		char c5 = 44032;
		char c6 = '\uac00';
		
//		char c7 = '';	// ������ ���� �߻� -> ������ �����ؼ� �ʱ�ȭ �ؾ� ��
		
		int uniCode = c1;
		
		System.out.println(c1);			// A
		System.out.println(c2);			// A
		System.out.println(c3);			// A
		
		System.out.println(c4);			// ��
		System.out.println(c5);			// ��
		System.out.println(c6);			// ��
		
		System.out.println(uniCode);	// 65
		
	}
}
