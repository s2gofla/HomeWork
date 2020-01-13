package homework;

public class Student extends Person {

	long stNumber;

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(
				"제 이름은" + this.getName() + "이고," + "제 나이는" + this.getAge() + "이며, " + "제 학번은" + this.stNumber + "입니다.");

	}
}
