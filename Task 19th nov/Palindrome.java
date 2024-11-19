//write a program to find palindrome or not using string

package AllProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner pal=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String A =pal.nextLine();
		String rev="";
		for(int i=A.length()-1;i>=0;i--)
		{
		rev=rev+A.charAt(i);	
		}
	
		 if(A.equals(rev))
		 {
			 System.out.println(A+ " is a palindrome");
		 }
		 else
		 {
			 System.out.println(A+" not a plaindrome");
		 }

	} 

}
