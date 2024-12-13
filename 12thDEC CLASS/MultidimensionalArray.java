//12/12/2024
package AllProgram;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a[][]=new int[100][100];
		int row,col,i,j;
		System.out.println("Enter number of rows:");
		row=scan.nextInt();
		System.out.println("Enter number of cols:");
		col=scan.nextInt();
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++)
			{
				System.out.print("Enter the array element :["+i+"]["+j+"]");
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Display 2D array elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
