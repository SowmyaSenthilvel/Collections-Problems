package ProgramsOnArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentDetailsInArrayList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentDataCollector students=new StudentDataCollector();
		
		boolean isEnd=true;
		
		while(isEnd) {
			 System.out.println();
			 System.out.println(" Welcome to Login Page of Student Details ");
			 System.out.println();
			 System.out.println("Enter a choice");
			 System.out.println();
			 System.out.println("1 for Adding Student's data to the arraylist");
			 System.out.println("2 for Viewing Student Details ");
			 System.out.println("3 for Inserting Student Info at the specific position in the arraylist");
			 System.out.println("4 for Removing specific element from the Arraylist");
			 System.out.println("5 for Sorting the arraylist using names");
			 System.out.println("6 for Searching the arraylist using their roll numbers");
			 System.out.println("7 for Copying one arraylist to another arraylist");
			 System.out.println("8 for Emptying the arraylist");
			 System.out.println("9 for Joining two arraylist");
			 System.out.println("10 for Checking the arralist is empty or not");
			 System.out.println("11 for Comparing two Arraylist");
			 System.out.println("12 for Shuffle the student Arraylist");
			 System.out.println("13 for Triming The size");
			 System.out.println("14 for Increasing the capacity");
			 System.out.println("15 for Reversing ArrayList");
			 System.out.println("16 for Swapping two index in Arraylist");
			 System.out.println("17 for Cloning a arraylist to another arraylist");
			 System.out.println("18 for Updating Student Info At Specific Index");
			 System.out.println("19 for Extracting a portion of student Info in Arraylist");
			 System.out.println("20 for Exit");
			 System.out.println();
			 byte choice=input.nextByte();
			 switch(choice) {
			 case 1:
				 students.studentdatacollector();
				 break;
				
			 case 2:
				 StudentDataViewer.studentdataviewer(students.getStudent());
				 break;
				
			 case 3:
				 System.out.println();
				 System.out.println("Inserting Student Info  ");
				 students.insertinginfo();
				 break;
				 
			 case 4:
				 System.out.println();
				 System.out.println("Removing specific element from the Arraylist");
      			 students.removinginfo();
				 break;
			 case 5:
				 System.out.println();
				 System.out.println("The sorted arraylist using name is");
				 students.sortinginfo();
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
				 System.out.println("Copying one arraylist to another");
				 students.copyinglist();
				 break;
			 case 8:
				 System.out.println("Empty an arraylist");
				 students.emptyArraylist();
				 break;
				 
			 case 9:
				 System.out.println("Join two arraylist");
				 students.joiningArraylist();
				 break;
				 
			 case 10:
				 System.out.println("Checking the Arraylist Empty or Not");
				 students.EmptyOrNot();
				 break;
				 
			 case 11:
				 System.out.println("Comparing two Arraylist");
				 students.compareTwoList();
				 break;
				 
			 case 12:
				 System.out.println("Shuffe the Arraylist");
				 students.shuffleList();
				 break;
			 case 13:
				 System.out.println("Trimming the size of Arraylist");
				 students.trimsize();
				 break;
			 case 14:
				 System.out.println("Increasing the capacity of Arraylist");
				 students.increasingcapacity();
				 break;
				 
			 case 15:
				 System.out.println("Reversing the arraylist");
				 students.reverseList();
				 break;
				 
			 case 16:
				 System.out.println("Swapping two index in the arralist");
				 students.swapElements();
				 break;
				 
			 case 17:
				 System.out.println("clone an arraylist to another array list");
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
				 isEnd=false;
				 break;
			 default :
				 System.out.println("Enter a valid choice");
				 break;
				
			 }
			 
		}
	}
		
}