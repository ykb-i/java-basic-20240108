package chapter01;

public class C_DataType {

	public static void main(String[] args) {
		// 변수의 데이터 타입
		// 기본형 데이터 타입, 참조형 데이터 타입
		
		// 기본형 데이터 타입
		
		// 정수형 데이터 타입 : 실수부가 존재하지 않음. 부호를 가고 있음.
		// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		byte byte1 = 99;
		// byte byte2 = 128;
		
		// short: 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32,768 ~ + 32,767
		short short1 = -129;
		// short short2 = 40000;
		
		// int: 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2,147,483,648 ~ 2,147,483,647
		int int1 = 40000;
		//int int2 = 2_147_483_648l; 	// 언더바(_)로 숫자의 ,를 대체할 수 있음
		
		//long: 8bute(64bit)의 크기를 가지는 정수형 데이터 타입;
		long long1 = 2_147_483_648l; 
		
		// 리터럴의 기본타입은 int임
		// 하지만 큰 수를 다뤄야하는 경우가 생기기 때문에 long또한 많이 사용함(은행, 천문학 등)
		// byte, short는 메모리를 극단적으로 줄여야할때 사용함(게임)
		
		// 실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		// float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 아래 6~7자리에서 오차가 발생
		float float1 = 0.123456789f;
		System.out.println(float1);
		
		// double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		double double1 = 0.123456789;
		System.out.println(double1);
		
		// 문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		// char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 0 ~ 65,535
		// 문자를 리터럴로 표시할 땐 ''로 묶어서 표현
		char char1 = 'A';
		char char2 = 65;
		char char3 = '\u0041';
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		// 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		// boolean : 1byte(8bit)의 크기를 가지는 논리형 데이터 타입
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		
		// 자동 형변환: 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		// 강제 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생
		int number1 = 300;
		long number2 = number1;
		number1 = (int) number2;
		
		byte number3 = (byte)number2;	
		// int는 32비트이고 byte는 8비트이기 때문에
		// 초과하는 비트는 버리고 8비트만 number3에 담긴다. <= 데이터 손실 발생
		System.out.println(number3);
		
		double number4 = number3;
		System.out.println(number4);
		
		// 배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		// new 연산자를 이용해서 컨테이너를 먼저 생성해야함
		// 한번 생성된 컨테이너의 크기는 변경할 수 없
		
		// 배열 변수 선언
		// 데이터타입[] 배열변수명;
		
		// 배열 생성
		// new 데이터타입[배열의길이];
		int[] numbers;
		numbers = new int[3];
		System.out.println(numbers);
		
		int[] numbers2 = {1, 2, 3};
		int[] numbers3 = new int[] {1, 2, 3};
		
		// 배열의 요소에 접근 혹은 사용할 때는 인덱스를 사용함.
		System.out.println(numbers3.length);
		
		int lastIndex = numbers3.length - 1;
		System.out.println(numbers3[lastIndex]);
		
		int[] example1 = new int[] {1,2,3};
		int[] example2 = example1;
		
		System.out.println(example1);
		System.out.println(example2);
		
		example1[0] = 99;
		
		System.out.println(example1[0]);
		System.out.println(example2[0]);
		
		char[] chars = {'e', 'x', 'a', 'm'};
		System.out.println(chars);
	
		// String : 문자의 배열을 표현하는데 사용되는 참조형 데이터 타입
		String string1;
		string1 = "맑음";
		String string2 = string1;
		String string3 = new String("맑음");
		System.out.println(string1.equals(string2));
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string3));
		System.out.println(string1 == string3);
		
		String string4 = "exam";
		
		// String 클래스의 주요 기능
		String statement = " My Name Is Loki ";
		
		// 1.문자열 결합
		// + 혹은 concat(문자열)으로 두 문자열을 연결할 수 있음
		System.out.println(statement.concat("@@@@"));
		
		// 2. 문자열 비교
		// equals(문자열) : 두 문자열이 동등한지 비교
		// compreTo(문자열) : 두 문자열을 사전순으로 비교(대소문자 구분)
		// compareToIgnoreCase(문자열) : 두 문자열을 사전순으로 비교(대소문자 구분 X)
		
		System.out.println(statement.equals("My Name Is Loki"));
		System.out.println(statement.compareTo(" Ay Name Is Loki "));
		
		// 3. 문자열 길이
		// length() : 문자열의 길이 반환
		System.out.println(statement.length());
		
		System.out.println(statement.toUpperCase());
		System.out.println(statement.toLowerCase());
		System.out.println(statement.trim());
		System.out.println(statement.replace("Loki", "Bong"));
		
		// 5. 문자열의 위치 찾기
		// string.indexOf(문자) : 찾고자 하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
		// string.lastIndexOf(문자) : 찾고자하는 문자열의 마지막 위치의 인덱스 번호를 반환
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고";
		System.out.println(statement.indexOf("기린"));
		System.out.println(statement.indexOf("별"));
		
		// 6. 부분 문자열
		// substring(시작인덱스), substring(시작인덱스, 종료인덱스)
		System.out.println(statement.substring(13, 20));
		
		// 참조형 데이터 타입
		// 주소를 가지는 변수의 데이터 타입
		// null을 가질 수 있음 (null: 아무것도 지정되지 않은 상태)
		// 배열, 클래스, 인터페이스, 열거형이 참조형 데이터 타입에
		String string5 = null;
		string5.substring(0);
		
	}

}














