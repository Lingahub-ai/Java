package AllProgram;

public class Task011212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=10;
		for(i=1;i<row;i++)
		{
			for(j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
