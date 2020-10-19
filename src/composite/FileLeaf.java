package composite;

public class FileLeaf implements Component {

	String fileName;
	long size;

	public FileLeaf(String name, long size) {
		this.fileName = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return fileName;
	}

	@Override
	public Long getSize() {
		return this.size;
	}

}
