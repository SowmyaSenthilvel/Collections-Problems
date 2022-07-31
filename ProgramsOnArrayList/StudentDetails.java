package ProgramsOnArrayList;

public class StudentDetails{
	private int RegNo;
	private String Name;
	private String EmailId;
	private int Age;
	private long AadharNo;
	
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo (int RegNo) {
		this.RegNo=RegNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String EmailId) {
		this.EmailId = EmailId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}
	public long getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(long AadharNo) {
		this.AadharNo = AadharNo;
	}
	public StudentDetails(int regNo, String name, String emailId, int age, long aadharNo) {
		super();
		RegNo = regNo;
		Name = name;
		EmailId = emailId;
		Age = age;
		AadharNo = aadharNo;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}