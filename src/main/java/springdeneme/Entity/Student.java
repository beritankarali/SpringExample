package springdeneme.Entity;

public class Student {
	
	private int ID;
	private String Name;
	private String Course;
	public Student(int iD, String name, String course) {
		ID = iD;
		Name = name;
		Course = course;
	}
	
	public Student() {}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
	
	
	
}
