package Ch04Scanner;

import java.util.Scanner;

//import 단축키
//모든 import경로 설정 : ctrl + shift + o
//단일 import경로 설정 : ctrl + shift + m
public class C02Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어,영어,수학 점수를 각각 받아
		// 국영수의 총점/평균을 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		
		System.out.printf("국영수의 총점 : %d 평균 : %.2f", sum, avg);
		
		sc.close();
		
		
		
	}

}
