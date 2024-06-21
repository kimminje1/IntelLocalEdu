package ch11.exam4;

public class Student {
	
	public String name;
	public int number=0;
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeamnumber() {
		return number;
	}

	public void setTeamnumber(int number) {
		this.number = number;
	}

	public Student(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public int getteamnumber() {
		return number;
	}
	
	
}
