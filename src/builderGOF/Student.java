package builderGOF;

public class Student {
	private String name;
	private String id;
	private String extraInfo;

	private Student() {

	}

	public Student createStudent(String name, String ID, String extraInfo) {
		Student student = new Student();
		student.setName(name);
		student.setId(ID);
		student.setExtraInfo(extraInfo);
		return student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

}
