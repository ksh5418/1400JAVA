package Ch02;

import java.util.Scanner;

public class C01양의정수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10진수 2진수 변환 코드
		int a;
		int b;
		System.out.println("10진수 입력");
		a = sc.nextInt();
		while(true) {
			if(a == 0) {
				break;
			}
			else {
				b = a % 2;
				a = a / 2;
				System.out.print(b);
			}
		}
		
		
//		데이터는 기본적으로 저장 이후에 연산처리가 된다
//		데이터를 저장히기 위해서는 저장할 데이터의 종류를 먼저
//		파악한 후 데이터의 구조에 맞게 저장을 해야한다
//		정수형 데이터는 10진수에서 기계가 이해하는 2진수로
//		진법변환되어 저장이 되게 되는데 이때 변환된 2진데이터를
//		담는 최소 공간단위를 bit라고 한다
//		
//		1	1	1	1	1	1	1	1	
//		128 64	32	16	8	4	2	1	= 255
//		
//		--------------------------
//		문제 2진수 -> 10진수 변환 값 확인
//		--------------------------
//		10000010(2)		->
//		11001010(2)		->
//		10110101(2)		->
//		00101101(2)		->
		
			
		
		
	}

}
