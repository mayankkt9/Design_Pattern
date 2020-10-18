package builderGOF;

public class Director {
	public void consturctStudent(Builder builder) {
		builder.setName("Mayank");
		builder.setID("101");
		builder.setExtraInfo("Ex");
	}

	public void constructInstructor(Builder builder) {
		builder.setName("InstName");
		builder.setID("102");
		builder.setExtraInfo("Ex1");
	}
}
