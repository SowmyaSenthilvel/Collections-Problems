package ProgramsOnStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackData {
	List<Integer> stacks=new ArrayList<Integer>();
	

	public void pushdata() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements want to add in Stack");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element want to add");
			stacks.add(input.nextInt());
		}
		System.out.println("Your elements is successfully pushed into the stack");
		System.out.println(stacks);
		
		
		
	}


	public void popdata() {
		
		if(stacks.size()==0) {
			System.out.println("Stack is empty.Please add some elements to pop it out");
		}
		else {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of elements want to take out from Stack");
			int n=input.nextInt();
			if(n>stacks.size()) {
				 System.out.println("You have chosen total no.of.elements is more than the stack size...");
			}
			else {
				for(int i=0;i<n;i++) {
					stacks.remove(stacks.size()-1);
				}
				System.out.println(stacks);
			}
		}
	}
		public void peekdata() {
			if(stacks.size()==0) {
				System.out.println("Stack is empty.Please add some elements to find peek");
			}
			else {
				System.out.println("Peek element in Stack is"+stacks.get(stacks.size()-1));
			}
		
		
	}
}
