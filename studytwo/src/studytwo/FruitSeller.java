package studytwo;

public class FruitSeller {
	// 나는 과일 장수에게 두개의 사과를 구매했다.
	// 나, 과일장수 - 객체
	// 두개 - 데이터
	// 구매했다 - 행위, 기능
	// 사과는 활용적 측면으로, 객체로 굳이 두지않아도 된다. 이는 프로그래머에 따라 차이점으로 나타날 수 있다.

	// 과일장수는 과일을 판다 -> 행위(메소드)
	// 과일장수는 사과 20개를 가지고 있다 -> 변하는 상태(변수)
	// 과일장수의 판매수익은 50,000원 -> 변하는 상태(변수)

	final int APPLE_PRICE = 1000; // final은 값을 변경하지말라는 선언, 변수를 상수화 시킬때 사용
	int numOfApple = 20; // 사과의 보유개수, 즉 변하는 상태
	int myMoney = 0; // 돈 보유 상황, 즉 변하는 상태



	public int SaleApple(int money) { // 사과를 팔았을때의 행위
		int num = money / APPLE_PRICE;
		numOfApple -= num; // 구매자가 돈을 가지고 사과를 삿을때, 그 num만큼 사과의 개수가 줄어든다.
		myMoney += money; // 돈은 판매자에게 그만큼 늘어난다.
		return num; // 실제 구매자가 구매한 사과의 개수를 반환한다.

	}

	public void showSaleResult() { // 현재 판매자의 상태를 보여주는 메소드
		System.out.println("남은사과:" + numOfApple);
		System.out.println("판매수익:" + myMoney);
	}

}