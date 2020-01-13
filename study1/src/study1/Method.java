package study1;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(4, 6); // sum메소드에서 실행한 값을 받을 변수를 생성해야함
		System.out.println(result);
		hello(); //메소드를 그냥 호출하는것
	}
	public static int sum(int num1, int num2) { // 1) 변수 타입에 따라 파라미터의 변수도 같아야한다.

		int a = num1 + num2;

		return a; // 2) 연산을 할 값이 있는 메소드는 반드시 돌려주어야 한다.

	}
	
	public static void hello() { //돌려줄 값이 없고, 보여주기만 할때는 void를 사용한다.
		
		System.out.println("안녕하세요");
		
	}
}
