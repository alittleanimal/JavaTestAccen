package exam.test1;

public class Student {
	private int sNo;
	private String sName;
	private int sSex,age,sJava;
	
	public Student() {
	}

	public Student(int sNo, String sName, int sSex, int age, int sJava) {
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.age = age;
		this.sJava = sJava;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsSex() {
		return sSex;
	}

	public void setsSex(int sSex) {
		this.sSex = sSex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsJava() {
		return sJava;
	}

	public void setsJava(int sJava) {
		this.sJava = sJava;
	}

	@Override
	public String toString() {
		String string = "man";
		if (this.getsSex() == 1) {
			string = "woman";
		}
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sSex=" + string
				+ ", age=" + age + ", sJava=" + sJava + "]";
	}
	
	
	
	
	
	
}
