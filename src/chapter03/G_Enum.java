package chapter03;

// 열거형(Enum): 서로 관련된 상수들의 집합을 나타내는 특수한 클래스
// enum 열거형타입이름 { 상수... }

enum Color1{
	// 지정하고자 하는 상수를 ,로 나열
	RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PURPLE
}

enum Color2{
	// 생성자 호출을 열거된 상수 위치에서 호출함
	RED("#ff0000", "rgb(255, 0, 0)"), 
	GREEN("#00ff00", "rgb(0, 255, 0)"), 
	BLUE("#0000fff", "rgb(0, 0, 255)");
	
	// 열겨형도 클래스이기 때문에 필드, 생성자, 메서드를 모두 가질 수 있음
	// enum의 필드는 상수로 사용되기 때문에 변경되면 안됨
	// 캡슐화 작업이 필요
	private String hex;
	private String rgb;
	
	// 생성자의 접근제어자 private
	// 인스턴스 생성 자체를 외부에서 못하도록 막는 것
	private Color2(String hex, String rgb) {
		this.hex = hex;
		this.rgb = rgb;
	}
	
	public String getHex() {
		return hex;
	}
	
	public String getRgb() {
		return rgb;
	}
}

public class G_Enum {

	public static void main(String[] args) {
		// 생성자 없이 바로 Color1으로 접근
		Color1 color = Color1.RED;
		
		if(color == Color1.RED) {
			System.out.println("빨간색!");
		}
		
		Color2 color2 = Color2.BLUE;
		System.out.println(color2);
//		System.out.println(color2.hex);
//		System.out.println(color2.rgb);
//		color2.hex = "#000099";
//		System.out.println(color2.hex);
		
		System.out.println(color2.getHex());
		
	}

}
