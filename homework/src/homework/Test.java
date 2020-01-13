package homework;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("김당당");
		student.setAge(27);
		student.stNumber = 20202394111L;
		
		
		teacher.setName("금독독");
		teacher.setAge(50);
		teacher.subject = "영어";
		
		
		student.print();
		teacher.print();
		
	}

}
