//3. Write a program to calculate average value of array element 

package AllProgram;

public class Task031112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a=new int[] {1,2,3,4,5};
		
		int sum=0;
		for(int b:a)
		{
		sum =sum+b;
		}
		double avg=sum/a.length;
	System.out.println(avg);
	}

}
