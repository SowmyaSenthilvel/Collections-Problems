package ProgramsOnVectors;

import java.util.Scanner;

public class StudentDetailsVectors {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentDataVector students=new StudentDataVector();
		boolean End=true;
		while(End) {
			 System.out.println();
			 System.out.println(" Welcome to Login Page of Student Details ");
			 System.out.println();
			 System.out.println("Enter a choice");
			 System.out.println();
			 System.out.println("1 for Adding Student's data to the Vectors");
			 System.out.println("2 for Viewing Student Details present in the Vector");
			 System.out.println("3 for Inserting Student Info at the specific position in the Vector");
			 System.out.println("4 for Removing specific element from the Vector");
			 System.out.println("5 for Sorting the vector using names");
			 System.out.println("6 for Searching the vector using their roll numbers");
			 System.out.println("7 for Copying one vector to another vector");
			 System.out.println("8 for Emptying the vector");
			 System.out.println("9 for Joining two vector");
			 System.out.println("10 for Checking the vector is empty or not");
			 System.out.println("11 for Comparing two vector");
			 System.out.println("12 for Shuffle the student vector");
			 System.out.println("13 for Triming The size");
			 System.out.println("14 for Increasing the capacity");
			 System.out.println("15 for Reversing vector");
			 System.out.println("16 for Swapping two index in vector");
			 System.out.println("17 for Cloning a vector to another vector");
			 System.out.println("18 for Updating Student Info At Specific Index");
			 System.out.println("19 for Extracting a portion of student Info in vector");
			 System.out.println("20 to Exit the Program");
			 System.out.println();
			 byte choice=input.nextByte();
			 switch(choice) {
			 case 1:
				 System.out.println("Adding the Student details in Vector");
				 students.studentdata();
				 break;
			 case 2:
				 System.out.println("Viewing Student details");
				 System.out.println();
				 StudentDataview.studentdataview(students.getStudent());
				 break;
			 case 3:
				 System.out.println("Inserting student Info at the specific position in the vector");
				 students.insertingInfo();
				 break;
			 case 4:
		 		System.out.println("Removing specific element from the vector");
		 		students.removeInfo();
		 		break;
		 	 case 5:
		 		System.out.println("Sorting the Vector");
		 		students.sortingInfo();
		 		break;
		 	 case 6:
				System.out.println();
				System.out.println("Searching the Student info using their roll number\n");
				System.out.println("Enter the roll number to search student info");
				int rollNo=input.nextInt();
				students.searchinginfo(rollNo);
				break;
			 case 7:
				System.out.println();
				System.out.println("Copying one vector to another");
				students.copyinglist();
				break;
			 case 8:
				System.out.println("Empty an vector");
				students.emptyVector();
				 break;
				 
			 case 9:
				System.out.println("Join two vector");
				students.joiningVector();
				break;
					 
			 case 10:
				System.out.println("Checking the vector Empty or Not");
				students.EmptyOrNot();
				break;
					 
			case 11:
				System.out.println("Comparing two vector");
				students.compareTwoList();
				break;
					 
			case 12:
				System.out.println("Shuffe the vector");
				students.shuffleList();
				break;
					 
			case 13:
				System.out.println("Trimming the size of vector");
				students.trimsize();
				break;
				
			case 14:
				System.out.println("Increasing the capacity of vector");
				students.increasingcapacity();
				break;
					 
			case 15:
				System.out.println("Reversing the vector");
				students.reverseList();
				break;
					 
			case 16:
				 System.out.println("Swapping two index in the vector");
				 students.swapElements();
				 break;
					 
			case 17:
				System.out.println("clone an vector to another vector");
				students.cloneList();
				break;
					 
			case 18:
				System.out.println("Update a student Info");
				students.updataInfo();
				break;
					 
			case 19:
				System.out.println("Extracting a portion of student Info in Arraylist");
				students.infoExtractor();
				break;
					 
			case 20:
				System.out.println("    Thank You    ");
				End=false;
				break;
					 
			default :
				System.out.println("Enter a valid choice");
				break;

				 
			 }
		}
	}

}
