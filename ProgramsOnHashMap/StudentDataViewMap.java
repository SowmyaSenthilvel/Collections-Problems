package ProgramsOnHashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentDataViewMap {
	public static void studentDataDisplay(HashMap<Long,StudentDetails> student) { 
		for(Entry<Long,StudentDetails> entryObj: student.entrySet()) {
			System.out.println();
			System.out.println("Student's Roll Number "+entryObj.getKey());
			StudentDetails details=entryObj.getValue();
			System.out.println("Student's Name "+details.StudentName);
			System.out.println("Student's EmailId "+details.EmailID);
			System.out.println("Student's Mobile Number "+details.MobileNo);
			System.out.println();
		}
	}

}
