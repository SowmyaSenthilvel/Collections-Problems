package ProgramsOnHashMap;

public class StudentDetails {
	long StudentRollNo;
	String StudentName;
	String EmailID;
	long MobileNo;
	
	public long getStudentRollNo() {
		return StudentRollNo;
	}
	public void setStudentRollNo(long studentRollNo) {
		StudentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	
	public StudentDetails(long studentRollNo, String studentName, String emailID, long mobileNo) {
		StudentRollNo = studentRollNo;
		StudentName = studentName;
		EmailID = emailID;
		MobileNo = mobileNo;
		
	}

}
