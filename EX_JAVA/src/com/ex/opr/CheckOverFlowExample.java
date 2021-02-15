package com.ex.opr;

import java.io.IOException;
import java.util.Scanner;

public class CheckOverFlowExample {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x���� �Է��ϼ���:");
		int x = sc.nextInt();
		System.out.print("y���� �Է��ϼ���:");
		int y = sc.nextInt();
		
		try {
			int result = safeAdd(x, y);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}
	
	public static int safeAdd(int x, int y) {
		
		if( x > 0 ) {
			if( y > (Integer.MAX_VALUE - x) ) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if(x < (Integer.MIN_VALUE - y) ) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		
		return x + y;
	}
}
