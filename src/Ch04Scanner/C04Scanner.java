package Ch04Scanner;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		System.out.println("확인 : ");
		System.out.println("문자열 : ");
		sc.nextLine();// 버퍼 구간에 \n 이 남아있던걸 날려버리는 역할
		String str = sc.nextLine();
		System.out.println("확인 : " + str);
		
		
		//nextLine을 사용할때 주의할 점!
		//nextLine만 사용하는게 아니라
		//nextInt(), nextDouble(), next()함수와
		//혼용해서 사용하는 경우
		//중간에 nextLine()한번 더 실행해서 버퍼공간에
		//남은 개행을 인식하지 못하도록 한다
		
	}

}
