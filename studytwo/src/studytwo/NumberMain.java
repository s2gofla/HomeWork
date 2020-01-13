package studytwo;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number nInst = new Number(); // Number클래스를 참조하겠다.
		System.out.println("메소드 호출 전:"  + nInst.getNumber());
		
		simpleMethod(nInst);
		System.out.println("메소드 호출 후:" + nInst.getNumber());
		
	}
public static void simpleMethod(Number numb) { //메소드 파라미터에도 참조변수가 올수있다
		
		numb.addNum(6); //Number 클래스에있는 addNum을 호출하여 메세지 전달
		
	}
}
