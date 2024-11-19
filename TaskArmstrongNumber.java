//write a java program to print the armstrong number or not from getting the input from the user
package AllProgram;
import java.util.Scanner;

public class TaskArmstrongNumber
	{

		public static boolean isArmstrong(int number) {
				int num = number;
				int sum =0, n = String.valueOf(number).length();

				while(number>0) {
					int digits = number %10;
					sum += Math.pow(digits,n);
					number /=10;
				}

				return sum == num;
		}

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the Number to check Armstrong Number: ");
	int i =input.nextInt();


	if (isArmstrong(i)){

		System.out.println("Armstrong Number");

	}
	else
	{
	System.out.println("Not Armstrong Number");
	}

}

}
