package com.ex.var;

public class GarbageValueExample {

	public static void main(String[] args) {
		
		byte var1 = 125;	// 127�� �Ѿ�� -128 ���� ������
		int var2 = 125;
		
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
