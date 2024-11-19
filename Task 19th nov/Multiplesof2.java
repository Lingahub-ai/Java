//Write a java program to print the multiple of 2 or not based on user input
package AllProgram;

import java.util.Scanner;

public class Multiplesof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
System.out.println("Enter a number to find whether it is multiples of 2: ");
int i =input.nextInt();
if(i%2==0)
{
	System.out.println( i+  " is multiples of 2");
}
else
{
	System.out.println("The given number is not multiples of 2");
}
	}

}
