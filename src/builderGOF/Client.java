package builderGOF;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		StudentBuilder sb1 = new StudentBuilder();
		director.consturctStudent(sb1);
		sb1.getStudent();

		director.constructInstructor(new InstructorBuilder());
	}
}
