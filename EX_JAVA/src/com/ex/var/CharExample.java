package com.ex.var;

public class CharExample {

	public static void main(String[] args) {
		
		// Unicode: 0~65535, 2byte
		
		char c1 = 'A';
		char c2 = 65;			// 10진수
		char c3 = '\u0041';		// 16진수
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
//		char c7 = '';	// 컴파일 에러 발생 -> 공백을 포함해서 초기화 해야 함
		
		int uniCode = c1;
		
		System.out.println(c1);			// A
		System.out.println(c2);			// A
		System.out.println(c3);			// A
		
		System.out.println(c4);			// 가
		System.out.println(c5);			// 가
		System.out.println(c6);			// 가
		
		System.out.println(uniCode);	// 65
		
	}
}
