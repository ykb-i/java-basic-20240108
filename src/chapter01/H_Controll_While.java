package chapter01;
import java.util.Scanner;

public class H_Controll_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문 : 반복할 횟수가 정해지지않았을 때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복을 종료
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = scanner.nextInt();
		int sum = 0;
		
//		while(number > 0) {
//			sum += number;
//			
//			System.out.print("정수를 입력하세요 : ");
//			number = scanner.nextInt();
//		}
//		System.out.println("sum = " + sum);
//		
		
		number = 0;
		sum = 0;
		while(true) {
			System.out.print("정수 : ");
			number = scanner.nextInt();
			if(number <= 0) break;
			if(number % 2 != 1) continue;
			sum += number;
			
		}
		
		System.out.println("총합 : " + sum);
	}

}
