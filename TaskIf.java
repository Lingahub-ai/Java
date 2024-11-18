//Write a program to print even number and odd number separately by using if
package AllProgram;

public class TaskIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Numbers:");
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				
			{
				
				System.out.println(i);
				
			}
			
			
		}
		System.out.println("Odd Numbers: ");
		for(int i=1;i<=30;i++)

		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
