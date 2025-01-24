package chapter01;

public class G_Controll_For {
	
	public static void main(String[] args) {
		
		
		for(int firstNum = 2; firstNum <= 9; firstNum++) {
			for(int secondNum = 1; secondNum <= 9; secondNum++) {
				System.out.println(firstNum + " * " + secondNum + " = " + firstNum * secondNum);
			}
			System.out.println("                ");
		}
		
		String[] fruits = new String[] {"apple", "banana", "cacao"};
		
		for(int index = 0; index < fruits.length; index++) {
			fruits[index] += " add";
		}
		
		// for-each: 컬렉션(배열)의 각 요소를 하나씩 변수에 복사해서 사용
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		// fruits에서 꺼내온 값을 fruit 변수에 할당하기 때문에
		// fruit변수에 add가 추가되고, fruits에는 영향을 미치지 않음
		for(String fruit: fruits) {
			fruit += " add";
		}
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		
	}
}
