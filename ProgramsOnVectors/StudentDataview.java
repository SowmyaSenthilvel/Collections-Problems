package ProgramsOnVectors;

import java.util.ArrayList;
import java.util.Vector;

import ProgramsOnArrayList.StudentDetails;

public class StudentDataview {
	public static void studentdataview(Vector<StudentPojo> student) {
		for(StudentPojo studObj: student) {
			printObject(studObj);	
			
		}
	}
	public static void printObject(StudentPojo studObj) {
		System.out.println("Student Name " +studObj.getName());
		System.out.println("Student Register Number " +studObj.getRegNo());
		System.out.println("Student Age " +studObj.getAge());
		System.out.println("Student Email Address " +studObj.getEmailId());
		System.out.println("Student AadharNo "+studObj.getMobileNum());
		System.out.println();
		
	}

}
