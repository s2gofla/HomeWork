package homework;

public class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {

		System.out.println("제 이름은" + this.name + "이고" + "제 나이는" + this.age);
	}

}
