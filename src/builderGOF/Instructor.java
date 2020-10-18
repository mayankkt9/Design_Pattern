package builderGOF;

public class Instructor {
	private String name;
	private String id;
	private String extraInfo;

	private Instructor() {
	}

	public Instructor createStudent(String name, String ID, String extraInfo) {
		Instructor instructor = new Instructor();
		instructor.setName(name);
		instructor.setId(ID);
		instructor.setExtraInfo(extraInfo);
		return instructor;
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
