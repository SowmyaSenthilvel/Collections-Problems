package ProgramsOnHashMap;

import java.util.HashMap;

import java.util.Scanner;
import java.util.Map.Entry;

public class StudentDetailsHashMap {
	static StudentDataInMap database=new StudentDataInMap();

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean isEnd=true;
		
		while(isEnd) {
			 System.out.println();
			 System.out.println(" Welcome to Login Page of Student Details ");
			 System.out.println();
			 System.out.println("Enter a choice");
			 System.out.println();
			 System.out.println("1 for Adding Student's data to the Hashmap");
			 System.out.println("2 for Viewing Student Details in Map ");
			 System.out.println("3 for Counting the number of Students in HashMap");
			 System.out.println("4 for  Copy all of the students details from the specified map to another map");
			 System.out.println("5 for Removing All the student details from a Hashmap");
			 System.out.println("6 for  check whether a map contains student details(key-value)mappings (empty) or not");
			 System.out.println("7 for  a Shallow copy of a HashMap instance");
			 System.out.println("8 to test if a map contains a mapping for the specified key (Student Roll No)");
			 System.out.println("9 to test if a map contains a mapping for the specified student details");
			 System.out.println("10 to  create a set view of the students details in a map");
			 System.out.println("11 for Exit");
			 System.out.println();
			 byte choice=input.nextByte();
			 switch(choice) {
			 case 1:
				 System.out.println("    Adding student details   ");
				 database.dataAdding();
				 break;
			 case 2:
				 System.out.println("   Viewing Student Details in Map    ");
				 StudentDataViewMap.studentDataDisplay(database.student);
				 break;
			 case 3:
				 System.out.println(" Counting the size of Student Hashmap");
				 database.countsize();
				 break;
			 case 4:
				 System.out.println("  Copy all Student details from one map to another   ");
				 database.copyMap();
				 break;
			 case 5:
				 System.out.println("    Removing all the student details from hashmap");
				 database.removeDetail();
				 break;
			 case 6:
				 System.out.println("   Hashmap is empty or not");
				 database.emptyHashmap();
				 break;
			 case 7:
				 System.out.println(" Shallow copy of hashmap instance  ");
				 database.shallowCopy();
				 break;
				 
			 case 8:
				 System.out.println("Test if a map contains specified key  ");
				 database.mapContains();
				 break;
			 case 9:
				 System.out.println("Test if a map contains specified Student Details");
				 database.mapContainsclss();
				 break;
			 case 10:
				 System.out.println("Create a set view of the students details in a map");
				 database.studentset();
				 break;
			 case 11:
				 System.out.println("       !!!!ThankYou!!!!         ");
				 isEnd=false;
				 break;
			 }
			 
			 
		}
			 
		
		
		
		
	}

}
