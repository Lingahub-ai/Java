package AllProgram;

import java.util.Scanner;

public class Task2Actress {
	enum actress{Tammana,Trisha,Nayanthara}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the actress name:");
		String input=sc.nextLine();
actress paired=actress.valueOf(input);
switch(input)
{
case "Tammana":
	System.out.println("Paiya");
	System.out.println();
	System.out.println("Suraa");
	System.out.println();
	System.out.println("Veeram");
	System.out.println();
	System.out.println("Tholzha");
	System.out.println();
	Scanner Tam=new Scanner(System.in);
	System.out.println("Enter a movie name to find the actor paired with: ");
	String A1=Tam.nextLine();
	switch(A1)
	{
	case "Paiya","Tholzha":
		System.out.println("Karthi is the pair of Tammana");
		break;
	case "Suraa":
		System.out.println("Vijay is the pair of Tammana");
		break;
	case "Veeram":
		System.out.println("Ajith is the pair of Tammana");
		break;
	}break;
case "Trisha":
	System.out.println("Gilli");
	System.out.println();
	System.out.println("Leo");
	System.out.println();
	System.out.println("VTV");
	System.out.println();
	Scanner Tri=new Scanner(System.in);
	System.out.println("Enter a movie name to find the actor paired with: ");
	String A2=Tri.nextLine();
	switch(A2)
	{
	case "Gilli","Leo":
			System.out.println("Vijay is the pair of Trisha");
		break;
	case "VTV":
		System.out.println("Simbu is the pair of Trisha");
		break;
	}break;
case "Nayanthara":
	System.out.println("Billa");
	System.out.println();
	System.out.println("Bigil");
	System.out.println();
	System.out.println("Nanum Rowdy Than");
	System.out.println();
	Scanner Nay=new Scanner(System.in);
	System.out.println("Enter a movie name to find the actor paired with: ");
	String A3=Nay.nextLine();
	switch(A3)
	{
	case "Billa":
			System.out.println("Ajith is the pair of Nayanthara");
		break;
	case "Bigil":
		System.out.println("Vijay is the pair of Nayanthara");
		break;
	case "Nanum Rowdy Than":
		System.out.println("Vijay Sethupathi is the pair of Nayanthara");
		break;
	}break;
}
	}

}





