package Ch05Operator;

public class C04ShiftOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 15; //00000000 00000000 00000000 00001111
		int num2 = 20; //00000000 00000000 00000000 00010100
		int num3 = num1 << 3;
		int num4 = num2 >> 2;
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
	}

}
