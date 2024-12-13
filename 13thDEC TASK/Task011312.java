//Task 13/12/24
//Add matrix by getting user input
package AllProgram;

import java.util.Scanner;

public class Task011312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("A set elements:");
		System.out.println("Enter no.of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter no of cols: ");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("Enter A set Elements: ["+i+"]["+j+"]: ");
				arr[i][j]=sc.nextInt();
			}
		}

		
		System.out.println("B set Elements");
		System.out.println("Enter no.of rows: ");
		int row1=sc.nextInt();
		System.out.println("Enter no of cols: ");
		int col1=sc.nextInt();
		if(row!=row1||col!=col1)
		{
			System.out.println("Calculation not possible");
			return;
		}
		int arr1[][]=new int[row1][col1];
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("Enter B set Elements: ["+i+"]["+j+"]: ");
				arr1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("A set Elements:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("B set Elements:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Matric Addition:");
		
		int[][]Add=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				Add[i][j]+=arr[i][j]+arr1[i][j];
				System.out.print(Add[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
