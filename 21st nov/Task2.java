package AllProgram;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int i,j,a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=in.nextInt();
		for(i=1;i<=a;i++)
		{
			for(j=a;j>=i;j--)
				System.out.print(i);
			System.out.println("");
		}
	}
}
