//write a java program to print the film name based on actor 
//based on block buster movie

package AllProgram;

import java.util.Scanner;

public class Task1NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the actor name:");
String name=sc.nextLine();
String actor=name;
switch(actor)
{
case "vijay":
	System.out.println("List of vijay movies:");
	System.out.println();
	System.out.println("1.Thalaiva");
	System.out.println("2.The GOAT");
	System.out.println("3.Mersal");
	System.out.println("4.Master");
	System.out.println("5.Bigil");
	System.out.println();
	Scanner vijayBB=new Scanner(System.in);
	System.out.println("Press 1 to know the BlockBusters of vijay");
	int A=vijayBB.nextInt();
	switch(A)
	{
	
	case 1:
		System.out.println("1.The goat");
		System.out.println("2.Mersal");
		System.out.println("3.Master");
		System.out.println("4.Bigil");
	}
	Scanner vijayF=new Scanner(System.in);
	System.out.println("Press 2 to know the BlockBusters of vijay");
	int B=vijayF.nextInt();
	switch(B)
	{
	case 2:
		System.out.println("Thalaiva");
	}break;
case "ajith":
	System.out.println("List of ajith movies:");
	System.out.println();
	System.out.println("1.Attakasam");
	System.out.println("2.Mankatha");
	System.out.println("3.Veeram");
	System.out.println("4.Vivegam");
	System.out.println("5.Red");
	System.out.println();
	Scanner ajithBB=new Scanner(System.in);
	System.out.println("Press 1 to know the BlockBusters of ajith");
	int A1=ajithBB.nextInt();	
	switch(A1)
	{
	
	case 1:
		System.out.println("1.Attakasam");
		System.out.println("2.Mankatha");
		System.out.println("3.Veeram");
	}
	Scanner ajithF=new Scanner(System.in);
	System.out.println("Press 2 to know the BlockBusters of ajith");
	int B1=ajithF.nextInt();
	switch(B1)
	{
	case 2:
		System.out.println("1.Vivegam");
		System.out.println("2.Red");
	}break;
case "rajini":
	System.out.println("List of rajini movies:");
	System.out.println();
	System.out.println("1.Sivaji");
	System.out.println("2.Enthiran");
	System.out.println("3.Chandramuki");
	System.out.println("4.2.0");
	System.out.println("5.Annatha");
	System.out.println();
	Scanner rajiniBB=new Scanner(System.in);
	System.out.println("Press 1 to know the BlockBusters of rajini");
	int A2=rajiniBB.nextInt();	
	switch(A2)
	{
	
	case 1:
		System.out.println("1.Sivaji");
		System.out.println("2.Enthiran");
		System.out.println("3.Chandramuki");
	}
	Scanner rajiniF=new Scanner(System.in);
	System.out.println("Press 2 to know the BlockBusters of rajini");
	int B2=rajiniF.nextInt();
	switch(B2)
	{
	case 2:
		System.out.println("1.2.0");
		System.out.println("2.Annatha");
	}break;
}
	}

}
