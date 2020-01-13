package study1;

public class Forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			System.out.println("구구단" + i + "단 시작");
			for (int k = 1; k < 10; k++) {
				System.out.println(i + "x" + k + "=" + i * k);
			}
		} // for end

		int i = 2;
		while (i < 10) {
			System.out.println("while문 구구단" + i);
			int k = 1;
			while (k < 10) {
				System.out.println(i + "x" + k + "=" + i * k);
				k++;

			}

			i++;
		} // while end

		String star = "*";
		for (int s = 0; s < 5; s++) {
			System.out.println(star);
			star += "*";

		}

	}

}
