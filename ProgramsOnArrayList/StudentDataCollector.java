package ProgramsOnArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentDataCollector {
	ArrayList<StudentDetails> student=new ArrayList<StudentDetails>();
	ArrayList<StudentDetails> student1=new ArrayList<StudentDetails>();
	
	
	public ArrayList<StudentDetails> getStudent() {
		return student;
	}

	public void studentdatacollector() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students details you want:");
		
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
		StudentDetails stud=new StudentDetails();
		System.out.println("Enter Student Name ");
		stud.setName(input.next());
		System.out.println("Enter Student Register Number ");
		stud.setRegNo(input.nextInt());
		System.out.println("Enter Student Age ");
		stud.setAge(input.nextInt());
		System.out.println("Enter Student Email Id ");
		stud.setEmailId(input.next());
		System.out.println("Enter Student Aadhar Number ");
		stud.setAadharNo(input.nextLong());
		student.add(stud);
		System.out.println();
		}
		
		
	}


	public void insertinginfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a student's index to add details ");
		StudentDetails stud=new StudentDetails();
		int m=input.nextInt();
		if(m<student.size()) {
		System.out.println("Enter Student Name ");
		stud.setName(input.next());
		System.out.println("Enter Student Register Number ");
		stud.setRegNo(input.nextInt());
		System.out.println("Enter Student Age ");
		stud.setAge(input.nextInt());
		System.out.println("Enter Student Email Id ");
		stud.setEmailId(input.next());
		System.out.println("Enter Student Aadhar Number ");
		stud.setAadharNo(input.nextLong());
		student.add(m,stud);
		}
		else {
			System.out.println("Please enter the index within the arraylist size to insert Student info");
		}
		
	}
	public void removinginfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index to remove details");
		int removeindex=input.nextInt();
		if(removeindex<student.size()) {
		student.remove(removeindex);
		StudentDataViewer.studentdataviewer(student);
		}
		else {
			System.out.println("Please enter the index within the arraylist size to remove Student info");
		}
		System.out.println();
		
	}
	public void sortinginfo() {
		System.out.println();
		ArrayList<StudentDetails> sorting=(ArrayList<StudentDetails>) student.stream().sorted(Comparator.comparing(StudentDetails::getName)).collect(Collectors.toList());
		StudentDataViewer.studentdataviewer(sorting);
	}

	public void searchinginfo(int rollNo) {
		for(StudentDetails studObject:student) {
			//System.out.println("Roll no to search is "+rollNo);
			if(rollNo==studObject.getRegNo()) {
				StudentDataViewer.printObject(studObject);
				return;
			}	
		}
		System.out.println("Please enter correct roll number");
		
	}

	public void copyinglist() {
		System.out.println();
		ArrayList<StudentDetails> studentx=student;
		StudentDataViewer.studentdataviewer(studentx);
	}
	
	public void emptyArraylist() {
		System.out.println();
		student.clear();
		StudentDataViewer.studentdataviewer(student);
	}

	public void joiningArraylist() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students details you want add in Arraylist 2:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
		StudentDetails stud1=new StudentDetails();
		System.out.println("Enter Student Name ");
		stud1.setName(input.next());
		System.out.println("Enter Student Register Number ");
		stud1.setRegNo(input.nextInt());
		System.out.println("Enter Student Age ");
		stud1.setAge(input.nextInt());
		System.out.println("Enter Student Email Id ");
		stud1.setEmailId(input.next());
		System.out.println("Enter Student Aadhar Number ");
		stud1.setAadharNo(input.nextLong());
		student1.add(stud1);
		System.out.println();
		}
		student.addAll(student1);
      }
	public void EmptyOrNot(){
		System.out.println();
		if(student.isEmpty()) {
		System.out.println("Student Arraylist is Empty ");
		}
		else {
			System.out.println("Student Arraylist is not Empty");
		}
		
	}
	public void compareTwoList() {
		System.out.println();
		ArrayList<StudentDetails> compare=(ArrayList<StudentDetails>)student.stream().filter(student1::contains).collect(Collectors.toList());
		StudentDataViewer.studentdataviewer(compare);
	}
	
	public void shuffleList() {
		System.out.println();
		Collections.shuffle(student);
		StudentDataViewer.studentdataviewer(student);
	}
	public void trimsize() {
		System.out.println();
		student.trimToSize();
		StudentDataViewer.studentdataviewer(student);
		System.out.println(" Student-Info is trimed to capacity");
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
		StudentDataViewer.studentdataviewer(student);
		
	}
	public void swapElements() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first index for swapping");
		int element1=input.nextInt();
		System.out.println("Enter the second index for swapping");
		int element2=input.nextInt();
		Collections.swap(student, element1, element2);
		StudentDataViewer.studentdataviewer(student);
	}

	public void cloneList() {
		System.out.println();
		student.clone();
		StudentDataViewer.studentdataviewer(student);
		
	}

	public void updataInfo() {
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the roll number to update Info");
		int rollNo=input.nextInt();
		for(int i=0;i<student.size();i++) {
			StudentDetails studObj=student.get(i);
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
				studObj.setAadharNo(input.nextLong());
//				int index=student.indexOf(studObj);
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
		List<StudentDetails> info=student.subList(0,size);
		for(StudentDetails objects:info) {
			StudentDataViewer.printObject(objects);
		}
	}

	
	
	

}
