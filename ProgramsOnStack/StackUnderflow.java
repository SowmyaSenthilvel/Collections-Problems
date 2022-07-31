package ProgramsOnStack;

import java.util.Scanner;

class StackUnderFlowException extends Throwable {
    public StackUnderFlowException(String exceptionMessage) {
        super(exceptionMessage);
    }
}

public class StackUnderflow {
    static void checkForStackUnderFlow(int user) throws StackUnderFlowException {
        if (user > Integer.MIN_VALUE) {
            System.out.println("Stack is under your control...");
        } else {
            throw new StackUnderFlowException("Stack is Under - Flowing...");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int user = input.nextInt();

        try {
            checkForStackUnderFlow(user);
        } catch (StackUnderFlowException soe) {
            System.out.println(soe.getMessage());
        }
    }
}