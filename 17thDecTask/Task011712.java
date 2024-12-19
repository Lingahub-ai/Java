//17/12/2024
//Write a program to create 2 threads and print even and odd from 1 to 20
//Write a java program to calculates the average of 5 subjects using threads

package AllProgram;

//import java.util.Scanner;

//class Even extends Thread
//{
//	Scanner sc= new Scanner(System.in);
//	
//	
//	public void run()
//	{
//		System.out.println("Enter a number: ");
//		int a =sc.nextInt();
//		if(a % 2==0)
//		{
//			System.out.println(a+" is even number");
//		}
//		else
//		{
//			System.out.println(a+" is a odd number");
//		}
//	}
//}
class Even extends Thread
{
	public void run()
	{
	int a=20;
	{System.out.println("Even numbers are:");
		for(int i=1;i<=a;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	}
	
}
class Odd extends Thread
{
	public void run()
	{
	int a=20;
	{System.out.println("Odd Numbers are:");
		for(int i=1;i<=a;i++)
		{
			if(i % 2 != 0)
			{
				
				System.out.println(i);
			}
		}
	}
	}
}

public class Task011712 {
	

	public static void main(String[] args) {
		Even e= new Even();
		Odd o= new Odd();
		e.start();
		o.start();

	}

}
