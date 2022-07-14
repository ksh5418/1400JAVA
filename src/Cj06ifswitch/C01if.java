package Cj06ifswitch;

import java.util.Scanner;

public class C01if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단순 IF
		//if(조건식)
		//{
		//	참인경우 실행되는 코드
		//}
		
//		int age = 7;
//		
//		if(age >= 8)
//			System.out.println("취학 아동입니다");
//		
//		System.out.println("첫번째 IF문 벗어남");
//		if(age <= 8)
//			System.out.println("미취학 아동입니다.");
//		
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램을 종료합니다.");
//		
		
		
		//if(조건식)
		//{
		// 참인경우 실행될 코드
		//}
		//else
		//{
		// 거짓인 경우 실행될 코드
		//}
		
		Scanner sc = new Scanner(System.in);
		//문제
		//정수 하나를 받아서 짝수면 "짝수입니다"
		//홀수면 "홀수입니다"를 출력하세요
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if(a%2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		//문제
		//정수 하나를 받아서 3의 배수면 "3의배수입니다"
		//4의 배수면 "4의 배수입니다"를 출력하세요
		System.out.print("정수를 입력하세요 : ");
		int b = sc.nextInt();
		
		if(b % 3 == 0)
			System.out.println("3의 배수입니다.");
		else if(b % 4 == 0)
			System.out.println("4의 배수입니다.");
		else
			System.out.println("3과 4의 배수가 아닙니다");

		
		//문제
		//두 정수를 입력받아서 큰수를 출력하세요(IF_ELSE)
		System.out.print("정수를 두개 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println(num1);
		else if(num1 < num2)
			System.out.println(num2);
		else
			System.out.println("두 수가 같습니다.");
		
		
		//문제
		//세 정수를 입력받아서 큰수를 출력하세요(단순 IF문으로만)
		
		System.out.print("정수를 세개 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x > y) {
			if(x > z) {
				System.out.println(x);				
			}else
				System.out.println(z);
		}else if(y > z) {
			System.out.println(y);
		}else
			System.out.println(z);
		
		
		//예제
		//국어,영어,수학 각각의 점수가 40점 이상이 되어야하고
		//총 평균이 60점이상이 되면 "합격: 출력
		//그게 아니면 불합격" 출력
		
		System.out.print("국어 영어 수학 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		double avg = (double)(kor+eng+math)/3;
		
		
		if(avg >= 60) {
			if(kor <= 40) 
				System.out.println("불합격");
			else if(eng <= 40)
				System.out.println("불합격");
			else if(math <= 40)
				System.out.println("불합격");
			else
				System.out.println("합격");
		}else
			System.out.println("불합격");
		
		//평균점수를 입력받아 그점수가
		//90점 이상이면 'A' 출력
		//80점 이상이면 'B' 출력
		//70점 이상이면 'C' 출력
		//60점 이상이면 'D' 출력
		//60점 미만이면 'F' 출력
		
		System.out.print("평균 점수를 입력하세요 : ");
		double avg1 = sc.nextInt();
		
		if(avg1 >= 90 && avg1 <= 100)
			System.out.println('A');
		else if(avg1 >= 80 && avg1 <=89)
			System.out.println('B');
		else if(avg1 >= 70 && avg1 <=79)
			System.out.println('C');
		else if(avg1 >= 60 && avg1 <=69)
			System.out.println('D');
		else
			System.out.println('F');
		
		

	}

}
