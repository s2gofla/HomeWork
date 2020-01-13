package homework;

public class Teacher extends Person {

	String subject;

	@Override
	public void print() {

		System.out.println("제 이름은" + this.getName() + "이고," + "제 나이는" + this.getAge() + "이며, " + "가르치는 과목은"
				+ this.subject + "입니다.");
	}

}
