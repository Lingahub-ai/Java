//17/12/2024
//write a Java program that calculates the average of 5 subject using threads

package AllProgram;

import java.util.Scanner;

class Average extends Thread
{
	Scanner sc= new Scanner(System.in);
	{
		System.out.println("Enter Your marks to find the average");
	}
	public void run()
	{
		int Tam,Eng,Mat,Sci,Soc;
		System.out.println("Enter Your Tamil mark:");
		Tam =sc.nextInt();
		System.out.println("Enter Your English mark:");
		Eng =sc.nextInt();
		System.out.println("Enter Your Maths mark:");
		Mat =sc.nextInt();
		System.out.println("Enter Your Science mark:");
		Sci =sc.nextInt();
		System.out.println("Enter Your Social mark:");
		Soc =sc.nextInt();
		double sum;
		System.out.println("Your Average:"+(Tam+Eng+Mat+Sci+Soc)/5);
	}

}
public class Task021712 {

	public static void main(String[] args) {
		Average obj=new Average();
		obj.start();

	}

}
