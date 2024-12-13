//Task 13/12/24
//Multiplication matrix by getting user input(method 2)
package AllProgram;

import java.util.Scanner;

public class Task031312_2 {

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
		if(row!=col1||col!=row1)
		{
			System.out.println("Error");
			return;
		}
		
		int arr1[][]=new int[row1][col1];
		
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
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
		System.out.println("Matric multiplication:");
		
		int[][]multi=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col1;j++)
			{
				multi[i][j]=0;
				for(int temp=0;temp<col;temp++)
				{
				multi[i][j]+=arr[i][temp]*arr1[temp][j];
				}
				System.out.print(multi[i][j]+" ");
			
			}
			System.out.println();
		}
		
	}

}
