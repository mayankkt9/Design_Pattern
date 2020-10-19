package composite;

public class Client {
	public static void main(String[] args) {

		DirectoryComposite root = new DirectoryComposite("RootFolder");
		DirectoryComposite director1 = new DirectoryComposite("directory1");
		DirectoryComposite director2 = new DirectoryComposite("directory2");
		root.add(director1);
		root.add(director2);
		root.add(new FileLeaf("file1", 120));
		root.add(new FileLeaf("file2", 180));
		root.add(new FileLeaf("file3", 200));
		director1.add(new FileLeaf("file4", 300));
		director1.add(new FileLeaf("file5", 500));
		director2.add(new FileLeaf("file6", 100));
		director2.add(new FileLeaf("file7", 200));

		System.out.println(root.getSize());
		System.out.println(director1.getSize());
		System.out.println(director2.getSize());
	}
}
