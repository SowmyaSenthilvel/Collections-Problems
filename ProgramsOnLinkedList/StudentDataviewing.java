package ProgramsOnLinkedList;

import java.util.LinkedList;

import ProgramsOnArrayList.StudentDetails;

public class StudentDataviewing {

	public static void studentdataview(LinkedList<StudentPojoDetails> student) {
		for(StudentPojoDetails studObj: student) {
			printDetails(studObj);	
			
		}
		
	}
	public static void printDetails(StudentPojoDetails studObject) {
		System.out.println("Student Name " +studObject.getName());
		System.out.println("Student Register Number " +studObject.getRegNo());
		System.out.println("Student Age " +studObject.getAge());
		System.out.println("Student Email Address " +studObject.getEmailId());
		System.out.println("Student AadharNo "+studObject.getMobileNum());
		System.out.println();
		
	}

}
