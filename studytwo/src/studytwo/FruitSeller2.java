package studytwo;

public class FruitSeller2 {
	int myMoney;
	int numOfApple;
	final int APPLE_PRICE;



	public FruitSeller2(int money, int appleNum, int price) { // 생성자는 1) 메소드와 클래스의 이름이 같으며
															//  2) 반환하지 않는 메소드여야한다.
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
}
