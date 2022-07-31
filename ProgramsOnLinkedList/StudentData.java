package ProgramsOnLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import ProgramsOnArrayList.StudentDataViewer;
import ProgramsOnArrayList.StudentDetails;

class Sortbyname implements Comparator<StudentPojoDetails> {

	@Override
	public int compare(StudentPojoDetails o1, StudentPojoDetails o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class StudentData {
	LinkedList<StudentPojoDetails> student=new LinkedList<StudentPojoDetails>();
	LinkedList<StudentPojoDetails> student1=new LinkedList<StudentPojoDetails>();
	
	public LinkedList<StudentPojoDetails> getStudent() {
		return student;
	}

	public void studentdata() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Student details you want to add ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			StudentPojoDetails studPojo=new StudentPojoDetails();
			System.out.println("Enter Student Name ");
			studPojo.setName(input.next());
			System.out.println("Enter Student Register Number ");
			studPojo.setRegNo(input.nextInt());
			System.out.println("Enter Student Age ");
			studPojo.setAge(input.nextInt());
			System.out.println("Enter Student Email Id ");
			studPojo.setEmailId(input.next());
			System.out.println("Enter Student Mobile Number ");
			studPojo.setMobileNum(input.nextLong());
			student.add(studPojo);
			System.out.println();
			
		}
		
		
		
	}

	public void insertinginfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index you want to insert a student Info");
		int index=input.nextInt();
		StudentPojoDetails stud=new StudentPojoDetails();
		if(index<student.size()) {
			System.out.println("Enter Student Name ");
			stud.setName(input.next());
			System.out.println("Enter Student Register Number ");
			stud.setRegNo(input.nextInt());
			System.out.println("Enter Student Age ");
			stud.setAge(input.nextInt());
			System.out.println("Enter Student Email Id ");
			stud.setEmailId(input.next());
			System.out.println("Enter Student Aadhar Number ");
			stud.setMobileNum(input.nextLong());
			student.add(index,stud);
		}
		else {
			System.out.println("Please enter the index within the arraylist size to insert Student info");
		}
	}

	public void removeInfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index you want to insert a student Info");
		int index=input.nextInt();
		if(index<student.size()) {
			student.remove(index);
			StudentDataviewing.studentdataview(student);
			}
			else {
				System.out.println("Please enter the index within the arraylist size to remove Student info");
			}
			System.out.println();
		
	}

	public void sortingInfo() {
		System.out.println();
//		LinkedList<StudentPojoDetails> sorting=(LinkedList<StudentPojoDetails>) student.stream().sorted(Comparator.comparing(StudentPojoDetails::getName)).collect(Collectors.toList());
		Collections.sort(student,new Sortbyname());	

		
	}

	public void searchinginfo(int rollNo) {
		for(StudentPojoDetails studObject:student) {
			if(rollNo==studObject.getRegNo()) {
				StudentDataviewing.printDetails(studObject);
				return;
			}	
		}
		System.out.println("Please enter correct roll number");
		
		
	}

	public void copyinglist() {
		System.out.println();
		LinkedList<StudentPojoDetails> studentx=student;
		StudentDataviewing.studentdataview(studentx);
	}

	public void emptyLinkedList(){
			System.out.println();
			student.clear();
			StudentDataviewing.studentdataview(student);
		}

	public void joiningLinkedList() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students details you want add in Arraylist 2:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
		StudentPojoDetails stud1=new StudentPojoDetails();
		System.out.println("Enter Student Name ");
		stud1.setName(input.next());
		System.out.println("Enter Student Register Number ");
		stud1.setRegNo(input.nextInt());
		System.out.println("Enter Student Age ");
		stud1.setAge(input.nextInt());
		System.out.println("Enter Student Email Id ");
		stud1.setEmailId(input.next());
		System.out.println("Enter Student Aadhar Number ");
		stud1.setMobileNum(input.nextLong());
		student1.add(stud1);
		System.out.println();
		}
		student.addAll(student1);
	}

	public void EmptyOrNot() {
		System.out.println();
		if(student.isEmpty()) {
		System.out.println("Student Linkedlist is Empty ");
		}
		else {
			System.out.println("Student Linkedlist is not Empty");
		}
	}

	public void compareTwoList() {
		System.out.println();
		LinkedList<StudentPojoDetails> compare=(LinkedList<StudentPojoDetails>)student.stream().filter(student1::contains).collect(Collectors.toList());
		StudentDataviewing.studentdataview(compare);
	}

	public void shuffleList() {
		System.out.println();
		Collections.shuffle(student);
		StudentDataviewing.studentdataview(student);
	}

	public void trimsize() {
		System.out.println();
//		student.trimToSize();
//		StudentDataViewer.studentdataviewer(student);
		System.out.println(" Linked list cannot be trimed to capacity");
		
	}

	public void increasingcapacity() {
		System.out.println();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the capacity value ");
		int capacityOfList=scanner.nextInt();
		if(capacityOfList > 100) {
			System.out.println("Capacity exceeds");
		}
		else {
			System.out.println("Capacity increased");
		}
	}

	public void reverseList() {
		System.out.println();
		Collections.reverse(student);
		StudentDataviewing.studentdataview(student);
		
	}

	public void swapElements() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first index for swapping");
		int element1=input.nextInt();
		System.out.println("Enter the second index for swapping");
		int element2=input.nextInt();
		Collections.swap(student, element1, element2);
		StudentDataviewing.studentdataview(student);
		
	}

	public void cloneList() {
		System.out.println();
		student.clone();
		StudentDataviewing.studentdataview(student);
		
	}

	public void updataInfo() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the roll number to update Info");
		int rollNo=input.nextInt();
		for(int i=0;i<student.size();i++) {
			StudentPojoDetails studObj=student.get(i);
			if(rollNo==studObj.getRegNo()) {
				System.out.println("Enter Student Name ");
				studObj.setName(input.next());
				System.out.println("Enter Student Register Number ");
				studObj.setRegNo(input.nextInt());
				System.out.println("Enter Student Age ");
				studObj.setAge(input.nextInt());
				System.out.println("Enter Student Email Id ");
				studObj.setEmailId(input.next());
				System.out.println("Enter Student Aadhar Number ");
				studObj.setMobileNum(input.nextLong());
				student.set(i, studObj);
				return;
				
			}
		
		}
		System.out.println("Please enter a valid roll number to Update Student Info");
	}

	public void infoExtractor() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the list which want to be Extracted");
		int size=input.nextInt();
		List<StudentPojoDetails> info=student.subList(0,size);
		for(StudentPojoDetails objects:info) {
			StudentDataviewing.printDetails(objects);
		}
		
	}
	
	
	
	
	

	
	
	

	

	
}
