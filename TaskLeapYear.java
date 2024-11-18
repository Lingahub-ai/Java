//write a java program  to find whether the year is leap or not
package AllProgram;
import java.util.Scanner;
public class TaskLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LY=new Scanner(System.in);
		System.out.println("Enter A Year: ");
		int year=LY.nextInt();
		if(year%4==0)
		{
			System.out.println(year+ " is a Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}

}
