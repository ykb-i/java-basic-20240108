package chapter01;
import java.util.Scanner;
public class F_Controll_Switch {

	public static void main(String[] args) {
		// switch문 : 특정 변수 혹은 표현식에 따라 실행할 코드 블럭의 범위를 결정하는 것
//		switch(일반표현식) {
//			case 값1:
//				일반표현식이 값1과 같을때 시작할 코드 블럭 위치
//			case 값2:
//				일반표현식이 값2와 같을때 시작할 코드 블럭 위치
//				switch 내부에서 break문을 만나면 switch 코드 블럭을 탈출
//				break;
//			default:
//				일반표현식이 case의 값과 일치하는 것이 하나도 없거나
//				바로 위에서 break문을 만나지 않으면 반드시 실행되는 코드 블럭
//		}
		
		// number라는 정수형 변수에 사용자로부터 정수를 입력받아 할당
		// 0이면 ABC를 출력
		// 1이면 BC를 출력
		// 2이면 C를 출력
		// 3이면 DE를 출력
		// 0~3이 아니면 E를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int number = scanner.nextInt();
		
		switch(number) {
		case 0:
			System.out.print("A");
		case 1:
			System.out.print("B");
		case 2:
			System.out.print("C");
			break;
		case 3:
			System.out.print("D");
		default:
			System.out.print("E");
		}
	}

}
