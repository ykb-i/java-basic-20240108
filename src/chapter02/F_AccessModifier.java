package chapter02;

// 접근제어자 (access modifier): 클래스, 메서드, 필드에 대해서 외부 접근데 대한 제어를 하는 것
// public: 모든 패키지에서 접근 가능
// protected: 같은 패키지 내부 or 외부 패키지의 자손클래스에서 접근 가능
// default(package): 같은 패키지 내부에서만 접근 가능
// private: 같은 클래스 내부에서만 접근 가능

// 특정 클래스파일(.java 파일)에서 public 클래스는
// 파일명과 일치해야하고 하나만 지정할 수 있음

//public class ExampleClass{
//	
//}

class AccessModifierSub1{
	
	void method() {
		F_AccessModifier instance = new F_AccessModifier();
		instance.publicInt = 0;
		instance.protectedInt = 0;
		instance.packageInt = 0;
		//instance.privateInt = 0;
	}
	
}
public class F_AccessModifier {
	
	public int publicInt;
	protected int protectedInt;
	int packageInt;
	private int privateInt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F_AccessModifier instance = new F_AccessModifier();
		instance.publicInt = 0;
		instance.protectedInt = 0;
		instance.packageInt = 0;
		instance.privateInt = 0;
	}

}
