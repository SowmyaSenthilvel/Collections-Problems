package ProgramsOnVectors;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

import ProgramsOnLinkedList.StudentDataviewing;
import ProgramsOnLinkedList.StudentPojoDetails;



class Sortbyname implements Comparator<StudentPojo> {

	@Override
	public int compare(StudentPojo o1, StudentPojo o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class StudentDataVector {
	Vector<StudentPojo> student=new Vector<StudentPojo>();
	Vector<StudentPojo> student1=new Vector<StudentPojo>();

	
	public Vector<StudentPojo> getStudent() {
		return student;
	}

	public void studentdata() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Student details you want to add ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			StudentPojo studPojo=new StudentPojo();
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

	public void insertingInfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index you want to insert details in the student info");
		int index=input.nextInt();
		StudentPojo stud=new StudentPojo();
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
		System.out.println("Enter the index you want to insert details in the student info");
		int index=input.nextInt();
		if(index<student.size()) {
			student.remove(index);
			StudentDataview.studentdataview(student);
			}
			else {
				System.out.println("Please enter the index within the arraylist size to remove Student info");
			}
			System.out.println();
		
	}

	public void sortingInfo() {
		System.out.println();
		Collections.sort(student,new Sortbyname());
		
	}

	public void searchinginfo(int rollNo) {
		for(StudentPojo studObject:student) {
			if(rollNo==studObject.getRegNo()) {
				StudentDataview.printObject(studObject);
				return;
			}	
		}
		System.out.println("Please enter correct roll number");	
	}

	public void copyinglist() {
		System.out.println();
		Vector<StudentPojo> studentx=student;
		StudentDataview.studentdataview(studentx);
	}

	public void emptyVector() {
		System.out.println();
		student.clear();
		StudentDataview.studentdataview(student);
	}

	public void joiningVector() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students details you want add in Arraylist 2:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
		StudentPojo stud1=new StudentPojo();
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
		Vector<StudentPojo> compare=(Vector<StudentPojo>)student.stream().filter(student1::contains).collect(Collectors.toList());
		StudentDataview.studentdataview(compare);
		
	}

	public void shuffleList() {
		System.out.println();
		Collections.shuffle(student);
		StudentDataview.studentdataview(student);
	}

	public void trimsize() {
		System.out.println();
		student.trimToSize();
		StudentDataview.studentdataview(student);
		
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
		StudentDataview.studentdataview(student);
		
	}

	public void swapElements() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first index for swapping");
		int element1=input.nextInt();
		System.out.println("Enter the second index for swapping");
		int element2=input.nextInt();
		Collections.swap(student, element1, element2);
		StudentDataview.studentdataview(student);
	}

	public void cloneList() {
		System.out.println();
		student.clone();
		StudentDataview.studentdataview(student);
	}

	public void updataInfo() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the roll number to update Info");
		int rollNo=input.nextInt();
		for(int i=0;i<student.size();i++) {
			StudentPojo studObj=student.get(i);
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
		List<StudentPojo> info=student.subList(0,size);
		for(StudentPojo objects:info) {
			StudentDataview.printObject(objects);
		}
	}
	
}	
	
	
	

	

	
	


