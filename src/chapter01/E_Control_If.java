package chapter01;

public class E_Control_If {

	public static void main(String[] args) {
		
		// 코드 블럭
		// 코드들의 묶음 (여러 구문을 하나의 묶음(기능)으로 취급)
		// {}로 표시
		{
			int a = 10;
			int b = 20;
			int result = a + b;
			System.out.println(result);
			
			// int a = 0;
		}
		
		// 코드 블럭이 존재한다고 인지만 한 후에 코드 블럭 내부를 읽지않기 때문에
		// 코드 블럭 안에 선언된 변수와 밖에 선언된 변수는
		// 중복된 이름을 가져도 상관없음
		int a = 0;
		
		{
			// int a = 0;
			int b = 0;
		}
		
		// 두개의 코드블록은 main에 종속되어있기 때문에
		// 위에 선언된 a를 이미 읽었기 때문에 두번째 코드블록에서는
		// a를 선언할 수 없다.
		
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		// 조건문 : 특정 조건이 만족하면 해당 코드 블럭을 실행하는 것
		// if문 : 주어진 논리표현식(조건)이 true이면 코드블럭을 실행함.
		// if (논리표현식) { 논리표현식이 true 일때 실행할 코드블럭 }
		
		System.out.println("if문 시작");
		int number = 10;
		if(number > 0) {
			System.out.println("양수");
		}
		System.out.println("if문 종료");
		
		// else문 : if문의 논리 표현식이 false일때 코드블럭을 실행함
		// 주의!
		// 1. else문은 반드시 if문 이후에 와야함(else 단독 사용 불가능)
		// 2. else문에는 논리표현식을 작성하지 않음
		
		System.out.println("if-else문 실행");
		number = 5;
		
		if(number > 0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		System.out.println("if-else문 종료");
		
		System.out.println("여러조건");
		
		number = 0;
		
		if(number > 0) System.out.println("양수");
		else if(number < 0) System.out.println("음수");
		else System.out.println(0);
		
		
		System.out.println("여러 조건 종료");
		
		String country = "대한민국";
		int age = 23;
		String gender = "남성";
		
//		if(country.equals("대한민국") && age == 23 && gender.equals("남성")) {
//			System.out.println("현역");
//		}
		
		boolean isActive = (country.equals("대한민국") && age == 23 && gender.equals("남성"));
		if(!isActive) {
			return;
		}
		System.out.println("현역");
	}

}









