package com.ex.opr;

import java.io.IOException;
import java.util.Scanner;

public class CheckOverFlowExample {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요:");
		int x = sc.nextInt();
		System.out.print("y값을 입력하세요:");
		int y = sc.nextInt();
		
		try {
			int result = safeAdd(x, y);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int x, int y) {
		
		if( x > 0 ) {
			if( y > (Integer.MAX_VALUE - x) ) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(x < (Integer.MIN_VALUE - y) ) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return x + y;
	}
}
