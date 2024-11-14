package AllProgram;

import java.util.Scanner;

public class   userInput {
	public static void main(String[] args) {
	// todo Auto-generated method stub
	// scanner class is used to get the input from the user 
	// its available in java.util package
	// nextInt()--reads int value from the user
	// nextLong()--reads long value from the user
	// nextLine()--reads string value from the user
	// new is used to create n number of objects

	Scanner obj=new Scanner (System.in);
	System.out.println("Enter the name: ");
	//string Input
	String name=obj.nextLine();
	//Numerical output 
	System.out.println("Enter the age:");
	int age=obj.nextInt();
	System.out.println("Basic Pay: ");
	double BP=obj.nextDouble();
	System.out.println("Rent Allowance:");
	double RA=obj.nextDouble();
    double TS=BP+RA;
	//output
	System.out.println("Name:"+name);
	System.out.println("age:"+age);
	System.out.println("Basic Pay:"+BP);
	System.out.println("Rent Allowance:"+RA);
	System.out.println("Total salary:"+TS);
	
	

	}
	
}
