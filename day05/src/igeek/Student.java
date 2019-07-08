package igeek;

public class Student {
	private String sno;
	private String name;
	private String sex;
	private String age;
	
	public Student(String sno, String name, String sex, String age) {
		super();
		this.sno = sno;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Student() {
		
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


}
