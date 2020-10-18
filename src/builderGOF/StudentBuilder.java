package builderGOF;

public class StudentBuilder implements Builder {

	private String name;
	private String ID;
	private String extra;

	@Override
	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	@Override
	public void setID(String ID) {
		this.ID = ID.toUpperCase();
	}

	@Override
	public void setExtraInfo(String extra) {
		this.extra = extra.toUpperCase();
	}

	public void getStudent() {
		if (name.length() > 1 && ID.length() > 1) {
			// return student
		}
	}

}
