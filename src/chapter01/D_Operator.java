package chapter01;

public class D_Operator {

	public static void main(String[] args) {
		int a = 15, b = 2;
		double c = 15.0, d = 7.0;
		
		int intResult = 0;
		double doubleResult = 0.0;
		
		intResult = a + b;
		doubleResult = c + d;
		System.out.println(intResult);
		System.out.println(doubleResult);
		
		// intResult = a + c;
		doubleResult = a + c;
		System.out.println(doubleResult);
		
		intResult = a - b;
		
		// 대입 연산자 : 좌항에 우항을 할당
		// 일반 대입 연산자 : =
		// 좌항에 우항의 연산 결과를 할당
		// 좌항에 일반 변수와 상수형 변수 모두 올 수 있음
		// 단, 상수형 변수에는 초기화 시에만 사용 가능
		int number = 10 + 5;
		
		// 복합 대입 연산자 : 타연산자=
		// 좌항에 우항의 연산 결과를 좌항에 할당
		// 좌항은 반드시 초기화가 이뤄진 일반 변수여야함.
		number += 3;
		System.out.println(number);
		
		number %= 5;
		System.out.println(number);
//		int number2;
//		number2 += 3;
//		final int number3 = 10;
//		number3 += 5;
		
		// == : 좌항이 우항과 같으면 true, 다르면 false
		// != : 좌항이 우항과 다르면 true, 같으면 false
		// a: 15, b: 2, c: 15.0, d: 7.0
		boolean booleanResult = a == b;
		System.out.println(booleanResult);
		booleanResult = a != b;
		System.out.println(booleanResult);
		
		// 논리 연산자 : 피연산자가 모두 논리값인 연산자, 피연산자를 조합
		
		// 논리 AND 연산자 : && - 좌항과 우항이 모두 true일 때 true를 반환, 하나라도 false면 false를 반환
		booleanResult = false && false;
		System.out.println(booleanResult);
		booleanResult = (a==b) && (c==d);
		System.out.println(booleanResult);
		
		// 논리 OR 연산자 : || - 좌항과 우항 중 하나만 true이면 true를, 모두 false이면 false를 반환
		
		// AND 연산자의 맨앞에 false가 오거나
		// OR 연산자의 맨앞에 true가 온다면
		// 이미 결과가 정해지기 때문에 뒤의 코드는 dead code가 됨.
		booleanResult = true || (a++ > b--);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
