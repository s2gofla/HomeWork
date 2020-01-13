package studytwo;

public class FruitMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 사과장수, 즉 서로다른 인스턴스의 생성은 변수 초기화문제를 고민하게한다. 이를 해결하기위해, 생성자를 만들어주는것
				FruitSeller2 seller1 = new FruitSeller2(0, 30, 1500); //값을 받는 생성자 , 생성자내에서는 final이 초기화가 가능하다
				FruitSeller2 seller2 = new FruitSeller2(0, 15, 3000); 
				
				//*디폴트 생성자 - 생성자가 없더라도 인스턴스 생성이 가능한데, 이는 자동으로 삽입되는 디폴트 생성자에 있다
				
	}

}
