package com.ex.opr;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
//		double z = x / y;	// infinity
		double z = x % y;	// NaN
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		if( Double.isInfinite(z) || Double.isNaN(z) ) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z + 2);
		}
	}
}
