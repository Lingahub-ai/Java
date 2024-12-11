//1.Write a java program to print 20 to 1 in reverse order using array without
//using build in functions 

package AllProgram;

public class Task011112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[20];
		for(int i=20;i>=1;i--)
		{
			a[20-i]=i;
			System.out.println(i);
		}
	}

}
