package chapter02;

// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스
// 추상 클래스 인스턴스를 생성할 수 없음, 반드시 추상 클래스를 상속받은 하위 클래스로 인스턴스를 생성해야 함.
// abstract class 추상클래스명 { ... }

// 추상 메서드: 선언부만 존재하고 구현부는 존재하지 않는 메서드
// 클래스 중에서는 반드시 추상 클래스 내부에서만 선언할 수 있음
// 반드시 추상 클래스를 상속받은 하위 클래스에서 재정의(오버라이딩)하여 구현해야함
// abstract 반환타입 추상메서드명(매개변수, ...);

// abstract: 추상 클래스 혹은 추상 메서드를 정의하는 제어자
// abstract가 붙은 클래스는 인스턴스를 생성할 수 없음
// abstract가 붙은 메서드는 구현부를 가질수 없음

abstract class Occupation{
	int annual;
	int income;
	
	// 추상클래스에서 생성자는 인스턴스를 생성하는 목적이 아님
	// 하위클래스에서 호출하여 사용할 수 있도록 제공하는 목적
	// 단, 기본 생성자가 없는 상태에서 생성자를 정의한다면
	// 하위클래스에 생성자 작성을 강요함
	Occupation(int annual, int income){
		this.annual = annual;
		this.income = income;
	}
	
	// 추상메서드는 하위 클래스에서 오버라이딩을 강요함
	abstract void work(); 
	
	// 추상클래스도 일반 메서드를 가질 수 있음
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
}

class Developer extends Occupation{
	String position;
	
	Developer(int annual, int income, String position){
		super(annual, income);
		this.position = position;
	}
	
	void eat(String food) {
		System.out.println(food + "을 먹습니다.");
	}
	
	@Override
	void work() {
		System.out.println("프로그램을 개발합니다.");
	}
}

class TourGuide extends Occupation{
	String country;
	
	TourGuide(int annual, int income, String country){
		super(annual, income);
		this.country = country;
	}
	@Override
	void work() {
		System.out.println(country + "에서 관광을 설명합니다.");
	}
	
	void sleep() {
		System.out.println("관광지에서 잠을 잡니다.");
	}
}

public class H_AbstractClass {

	public static void main(String[] args) {
		//Occupation occupation = new Occupation(10, 100);
		Developer developer = new Developer(10, 100, "백엔드");
		TourGuide tourguide = new TourGuide(1, 20, "대한민국");
		
		developer.work();
		System.out.println(tourguide.annual);
	}

}

// 제어자 조합
// static이 붙은 변수: public + static + final(자주 사용)
// private + final이 붙은 변수 : 생성자에서 필수로 초기화함을 의미
// private + final이 붙은 메서드 : final이 의미가 없음(final은 오버라이딩을 못한다는 의미인데, private으로 인해 접근자체가 불가능하기 때문)
// private + abstract가 붙은 메서드 : 불가능한 조합
// final + abstract가 붙은 클래스와 메서드 : 불가능한 조합


