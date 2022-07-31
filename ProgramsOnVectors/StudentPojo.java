package ProgramsOnVectors;

public class StudentPojo {
	private int RegNo;
	private String Name;
	private String EmailId;
	private int Age;
	private long MobileNum;
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public long getMobileNum() {
		return MobileNum;
	}
	public void setMobileNum(long mobileNum) {
		MobileNum = mobileNum;
	}
	public StudentPojo(int regNo, String name, String emailId, int age, long mobileNum) {
		RegNo = regNo;
		Name = name;
		EmailId = emailId;
		Age = age;
		MobileNum = mobileNum;
	}
	public StudentPojo() {
		
	}
	
}
