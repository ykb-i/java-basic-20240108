package chapter01;

public class A_Variable {

	public static void main(String[] args) {
		
		// 변수(variable)
		// 데이터를 메모리에 저장하는데 사용되는 공간 요소
		// 변수를 생성(선언)할 때는 반드시 해당 변수가 가질 수 있는 데이터의 형태를 지정해야함
		
		// 선언(생성) 방법
		// 데이터타입 변수명;
		int number1;
		
		// 초기화 방법
		// 변수명 = 데이터;
		number1 = 10;
		
		// 선언과 초기화를 동시에 하는 방법
		// 데이터타입 변수명 = 데이터;
		int number2 = 22;
		
		System.out.println(number1);
		System.out.println(number2);
		
		// 변수는 선언 후 반드시 초기화한 다음 사용할 수 있음
//		int number3;
//		System.out.println(number3);
		
		// 변수에 지정된 데이터 타입이 아니면 할당이 불가능
		// int number3 = 3.14;
		
		// 변수에 처음 데이터를 넣는 행위가 아니기 때문에 초기화가 아님
		// 할당 혹은 재할당
		number1 = 400;
		
		// 변수 사용 목적
		// 1. 데이터 저장 목적
		// 2. 변할 수 있는 데이터에 대해서 이름을 부여
		
		// 변수 명명 규칙
		// 1. 중복된 변수명 사용할 수 없음
		int number4;
		// int number4;
		// 변수의 데이터타입이 다르더라도 같은 변수명을 사용할 수 없음
		// double number4;
		int Number4;
		
		// 2. 연산자로 사용되는 특수문자는 포함할 수 없음
		// int number+;
		// int number_$;
		
		// 3. 변수명은 숫자로 시작할 수 없음
		// int 1number;
		
		// 4. 키워드로만 구성되어있는 단어는 사용할 수 없음
		// int int = 10;
		
		// 비문법상 규칙 (암묵적 룰)
		// 1. 띄어쓰기 규칙
		// - Camel Case
		String homeAdress = "seochang";
		// - Snake Case
		String home_adress = "seochang";	
		
		// - Upper : 대문자 표현
		// - Lower : 소문자 표현
		
		// CamelCase : 프로그래밍 언어
		// UpperCamelCase : 첫글자를 대문자로 시작 - 클래스, 인터페이스
		// lowerCamelCase : 첫글자를 소문자로 시작 - 변수, 함수, 메서드
		
		// snake_case : 스크립트 언어
		// UPPER_SNAKE_CASE : 모든 글자를 대문자로 작성 - 상수형 변수
		// lower_snake_case : 모든 글자를 소문자로 작성 - 변수, 함수, 메서드
		
		// 2. 약어 사용 금지
		// 단축어를 사용하지 않도록 약속
		// 자신만 알고 있는 약어를 사용하면 다른 개발자가 이해하기 어려움
		// 독일식표기법 사용하여 변수명 작성을 권장
		int subtractYesterdaysDateTodaysResults = 0;
		
		// 상수(constant)
		// 초기화가 이뤄지면 변경이 불가능한 변수
		// 변수 선언 시에 데이터 타입 앞에 final 키워드를 붙여서 선언
		// 상수는 변수와 달리 값에 상수명을 할당해주는 역할을 함.
		final int NUMBER;
		NUMBER = 100;
		
		final double PI = 3.14;
//		PI = 3.1415;
		
		// 1. 리터럴에 이름을 부여하기 위해 많이 사용됨
		// 리터럴으로만 표현을 한다면 해당하는 리터럴이 무엇인지 이해하기 어려움
		double result = 77.6 * 163;
		
		final double I_PHONE_16_PRO_MAX_WIDTH = 77.6;
		final double I_PHONE_16_PRO_MAX_HEIGHT = 163;
		double iPhone16ProMaxArea = I_PHONE_16_PRO_MAX_WIDTH * I_PHONE_16_PRO_MAX_HEIGHT;
		
		// 2. 데이터를 보호하기 위한 목적
		final int INPUT_NUMBER = 8;
		
		// 리터럴 상수: 데이터 그 자체(코드 상에서)
		// int age = 32; 이라는 구문에서 '32'가 리터럴
		// 32 = 10;
	}

}
