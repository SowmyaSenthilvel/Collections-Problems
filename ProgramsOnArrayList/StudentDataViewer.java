package ProgramsOnArrayList;

import java.util.ArrayList;

public class StudentDataViewer {

	public static void studentdataviewer(ArrayList<StudentDetails> student) {
		
		for(StudentDetails studObj: student) {
			printObject(studObj);	
			
		}
		
	}
	public static void printObject(StudentDetails studObj) {
		System.out.println("Student Name " +studObj.getName());
		System.out.println("Student Register Number " +studObj.getRegNo());
		System.out.println("Student Age " +studObj.getAge());
		System.out.println("Student Email Address " +studObj.getEmailId());
		System.out.println("Student AadharNo "+studObj.getAadharNo());
		System.out.println();
		
	}
	

}
