package ProgramsOnHashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentDataInMap {
	 
	HashMap<Long,StudentDetails> student=new HashMap<Long,StudentDetails>();
	long StudentRollNo;
	String StudentName;
	String EmailID;
	long MobileNo;
	
	 public HashMap<Long, StudentDetails> getStudent() {
			return student;
		}
	
	public void dataAdding() {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Students details You Want");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter Student's Roll no ");
			StudentRollNo=input.nextLong();
			System.out.println("Enter Student's name ");
			StudentName=input.next();
			System.out.println("Enter Student's Email ID ");
			EmailID=input.next();
			System.out.println("Enter Student's Mobile Number ");
			MobileNo=input.nextLong();
			StudentDetails studObj=new StudentDetails(StudentRollNo,StudentName,EmailID,MobileNo);
			student.put(StudentRollNo, studObj);
			System.out.println();
		}
	}

	public void countsize() {
		System.out.println();
		int size=student.size();
		System.out.println("The size of student Hashmap is "+size);
		
		
	}

	public void copyMap() {
		
		HashMap<Long,StudentDetails> student1=new HashMap<Long,StudentDetails>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Students details You Want");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			StudentDetails stud=new StudentDetails(StudentRollNo,StudentName,EmailID,MobileNo);
			System.out.println("Enter Student's Roll no ");
			stud.setStudentRollNo(input.nextLong());
			System.out.println("Enter Student's name ");
			stud.setStudentName(input.next());
			System.out.println("Enter Student's Email ID ");
			stud.setEmailID(input.next());
			System.out.println("Enter Student's Mobile Number ");
			stud.setMobileNo(input.nextLong());
			student.put(stud.StudentRollNo, stud);
			System.out.println();
			
		}
		student.putAll(student1);
	}

	public void removeDetail() {
		System.out.println();
		student.clear();
		System.out.println("All Student details are removed successfully");
		
	}

	public void emptyHashmap() {
		System.out.println();
		if(student.isEmpty()==true) {
			System.out.println("Student Hashmap is Empty");
		}
		else {
			System.out.println("Student Hashmap is not empty");
		}
		
	}

	public void shallowCopy() {
		HashMap<Long,StudentDetails> studentcopy=new HashMap<Long,StudentDetails>();
		studentcopy=(HashMap)student.clone();
		StudentDataViewMap.studentDataDisplay(studentcopy);
		
	}

	public void mapContains() {
		if(student.containsKey(StudentName)==true) {
			System.out.println(student.containsKey(StudentName));
		}
		else {
			System.out.println("The map doesn't contains the specified key");
		}
		
		
	}

	public void mapContainsclss() {
		System.out.println("Conatins specified class");
		
	}

	public void studentset() {
		Set set1=student.entrySet();
		StudentDataViewMap.studentDataDisplay(student);
		
	}

}
