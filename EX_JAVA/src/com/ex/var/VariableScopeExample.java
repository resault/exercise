package com.ex.var;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5; 	// 변수는 선언된 블록 내에서만 사용 가능
		
	}
}
