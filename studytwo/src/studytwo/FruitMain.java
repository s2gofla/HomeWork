package studytwo;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitSeller seller = new FruitSeller(); // 클래스는 틀이며, 메모리에 할당되려면(즉, 실체화) 이 문법을 사용하여야한다
		// 참조변수 선언 		   = 인스턴스의 생성
		FruitBuyer buyer = new FruitBuyer(); // 판매자와 구매자의 클래스를 참조하겠다.
		
		buyer.buyApple(seller, 2000); //구매자 클래스에 있는, buyApple 메소드를 호출 -> 메세지를 전달 : seller에게 2000원어치 사과를 구매
		
		System.out.println("과일 판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("과일 구매자의 현재상황");
		buyer.showBuyResult();
	}

}
