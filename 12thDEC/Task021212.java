package AllProgram;

public class Task021212 
{
	public static void main (String args[]) {
	int i,j,row=10;
	for(i=1;i<row;i++)
	{
		for(j=0;j<row-i;j++)
		{
			System.out.print(" ");
		}
	
		for(j=0;j<2*i-1;j++)
		{
			
			System.out.print("*");
		}
		System.out.println();
	
}
}
}