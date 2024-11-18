//write a program to print the table of any number b/w 1-10 from the user using for
package AllProgram;
import java.util.Scanner;
public class TaskFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int Number=obj.nextInt();
		
	for( i=1;i<=10;i++)
			{
			System.out.println(i + "x" + Number + "=" + (i*Number));
			
			}
	
		}

	}
