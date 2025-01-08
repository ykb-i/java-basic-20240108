package chapter03;

public class B_package1 {

	public static void main(String[] args) {
		
		// Wrapper 클래스: 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있도록 도움을 주는 클래스
		// 기본형 데이터 타입의 풀네임의 첫글자를 대문자로 지정하여 사용함.
		// 데이터가 외부에서 서비스 안으로 넘어올 때 많이 사용
		// 데이터 전송객체(Data Transfer Object)
		// 외부에서 온 데이터가 사용자가 입력한 데이터인지 아닌지를 구분하기 위해 사용
		// ex) 숫자 0
		
		// int -> Integer
		int basicInt = 10;
		Integer wrapperInteger = null;
		wrapperInteger = basicInt;
		// wrapper 클래스는 null을 가질 수 있기 때문에
		// 기본형 데이터 타입에 참조형 데이터 타입을 할당할땐 주의해야함
		basicInt = wrapperInteger;
		System.out.println(basicInt);
		
		// double -> Double
		double basicDouble = 1.0;
		Double wrapperDouble = 1.0;
		
		// boolean -> Boolean
		boolean basicBoolean = false;
		Boolean wrapperBoolean = true;
		
		// wrapper에서 자주 사용되는 기능
		// parse 메소드: 문자열을 특정 타입으로 변경
		double number = Double.parseDouble("10.11");
		
		String string = Double.toString(10.11);
		string = wrapperDouble.toString();
		
		System.out.println(Math.round(3.1415 * 100) / 100.0);
		
		System.out.println(Math.round(98765 / 100.0));
		System.out.println(Math.round(98765 / 100.0) * 100);
	}

}
