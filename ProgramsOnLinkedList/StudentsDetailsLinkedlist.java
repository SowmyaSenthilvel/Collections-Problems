package ProgramsOnLinkedList;

import java.util.Scanner;

public class StudentsDetailsLinkedlist {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentData students=new StudentData();
		
		boolean End=true;
		while(End) {
				 System.out.println();
				 System.out.println(" Welcome to Login Page of Student Details ");
				 System.out.println();
				 System.out.println("Enter a choice");
				 System.out.println();
				 System.out.println("1 for Adding Student's data to the Linkedlist");
				 System.out.println("2 for Viewing Student Details ");
				 System.out.println("3 for Inserting Student Info at the specific position in the Linkedlist");
				 System.out.println("4 for Removing specific element from the Linkedlist");
				 System.out.println("5 for Sorting the Linkedlist using names");
				 System.out.println("6 for Searching the Linkedlist using their roll numbers");
				 System.out.println("7 for Copying one Linkedlist to another arraylist");
				 System.out.println("8 for Emptying the Linkedlist");
				 System.out.println("9 for Joining two Linkedlist");
				 System.out.println("10 for Checking the Linkedlist is empty or not");
				 System.out.println("11 for Comparing two Linkedlist");
				 System.out.println("12 for Shuffle the student Linkedlist");
				 System.out.println("13 for Triming The size");
				 System.out.println("14 for Increasing the capacity");
				 System.out.println("15 for Reversing LinkedList");
				 System.out.println("16 for Swapping two index in Linkedlist");
				 System.out.println("17 for Cloning a Linkedlist to another Linkedlist");
				 System.out.println("18 for Updating Student Info At Specific Index");
				 System.out.println("19 for Extracting a portion of student Info in Linkedlist");
				 System.out.println("20 to Exit the Program");
				 System.out.println();
				 byte choice=input.nextByte();
				 switch(choice) {
				 case 1:
					 System.out.println("Adding the Student details in Linked list");
					 students.studentdata();
					 break;
				 
		 		case 2:
		 			System.out.println("Viewing Student Details");
		 			StudentDataviewing.studentdataview(students.getStudent());
		 			break;
		 		case 3:
		 			System.out.println("Insering Student Info at the specific position in the Linkedlist");
		 			students.insertinginfo();
		 			break;
		 		case 4:
		 			System.out.println("Removing specific element from the Linked list");
		 			students.removeInfo();
		 			break;
		 		case 5:
		 			System.out.println("Sorting the Linked List");
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
					 System.out.println("Copying one Linkedlist to another");
					 students.copyinglist();
					 break;
				 case 8:
					 System.out.println("Empty an Linkedlist");
					 students.emptyLinkedList();
					 break;
				 
				 case 9:
					 System.out.println("Join two Linkedlist");
					 students.joiningLinkedList();
					 break;
					 
				 case 10:
					 System.out.println("Checking the Linkedlist Empty or Not");
					 students.EmptyOrNot();
					 break;
			 
				 case 11:
					 System.out.println("Comparing two Linkedlist");
					 students.compareTwoList();
					 break;
					 
				 case 12:
					 System.out.println("Shuffe the Linkedlist");
					 students.shuffleList();
					 break;
					 
				 case 13:
					 System.out.println("Trimming the size of Linkedlist");
					 students.trimsize();
					 break;
				 case 14:
					 System.out.println("Increasing the capacity of Linkedlist");
					 students.increasingcapacity();
					 break;
					 
				 case 15:
					 System.out.println("Reversing the Linkedlist");
					 students.reverseList();
					 break;
					 
				 case 16:
					 System.out.println("Swapping two index in the Linkedlist");
					 students.swapElements();
					 break;
					 
				 case 17:
					 System.out.println("Clone an Linkedlist to another Linkedlist");
					 students.cloneList();
					 break;
					 
				 case 18:
					 System.out.println("Update a student Info");
					 students.updataInfo();
					 break;
					 
				 case 19:
					 System.out.println("Extracting a portion of student Info in Linkedlist");
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
