package chapter02;

// JVM : 자바 가상 기계
// 실제 컴파일된 코드를 실행하는 기계
// 별도의 메모리 구조를 가짐

// Method Area (메서드 영역)
// : 모든 곳에서 접근가능한 영역, 코드를 읽고 각 클래스의 구조를 저장하고 있음

// Heap Area (힙 영역)
// : 모든 곳에서 접근가능한 영역, 인스턴스 혹은 배열과 같은 new 연산자를 통해 생성된 객체들이 저장되는 영역

// Stack Area (스택 영역)
// : 각 스레드 별로 독립적으로 존재하는 영역, 메서드 호출이 종료되면 제거됨
// 각 코드블럭마다 하나의 스택이 생성됨

// 메서드 영역에 기억됨.
// int iv, cv, void im(){}, void cm(){}
class EC2{
	int iv;
	static int cv;
	
	void im() {
		int lv = 10;
		EC2 itc = new EC2();
		
	}
	
	static void cm() {
		int clv = 10;
	}
}

public class B_JVM {
	
	static void method1(int arg) {
		arg++;
	}
	
	static void method2(EC2 arg) {
		arg.iv++;
	}
	// 1. main 컨테이너가 스택 영역에 쌓임
	// lv1, lv2의 공간이 main 컨테이너안에 생기고 값이 할당됨
	public static void main(String[] args) {
		
		int lv1 = 20;
		double lv2 = 3.5;
		// 2. 새로운 코드블록이 생성되어 스택에 쌓임
		if(lv1 > 0) {
			int cb = 30;
			// main 컨테이너에 존재하는 lv1에 cb값인 30을 재할당
			lv1 = cb;
		}
		// 코드블럭의 코드가 끝난 뒤 스택에서 사라짐
		
		// 스택 영역의 main 공간안에 itc1공간이 생성됨
		// 힙 영역에 EC2.h1이라는 itc1의 공간이 할당되고 iv, im 공간이 생성됨
		// 스택 영역에 존재하는 itc1의 공간에 itc1의 힙 영역에서의 주소(EC2.h1)가 할당됨
		// itc2도 동일한 작업이 실행됨
		EC2 itc1 = new EC2();
		EC2 itc2 = new EC2();
		
		// 힙 영역의 EC2.h1에 있는 iv영역에 10을 할당
		// 힙 영역의 EC2.h2에 있는 iv영역에 -99를 할당
		itc1.iv = 10;
		itc2.iv = -99;
		
		// cv는 클래스 변수이기 때문에 
		// 메서드 영역에 있는 cv에 3000의 값이 할당됨
		itc1.cv = 3000;
		
		// im에는 new 연산자가 있기 때문에 
		// 힙 영역에 EC2.h3 공간이 생성
		itc1.im();
		
		int a = 99;
		method1(a);
		method2(itc1);
		System.out.println(a);
		System.out.println(itc1.iv);
	}


}
