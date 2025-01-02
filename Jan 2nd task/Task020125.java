//Write a Java program to create a method that takes a string as input 
//and throws an exception if the string does not contain vowels

package AllProgram;
import java.io.*;
public class Task020125 {

	public static void main(String[] args) {
		try {
			String A="Lingaa";
			System.out.println(A);
			checkVowels(A);
		}
		catch(NoVowelsException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
public static void checkVowels(String A) throws NoVowelsException {
    boolean containsVowels = false;
    String vowels = "aeiouAEIOU";

    for (int i = 0; i < A.length(); i++) {
      char ch = A.charAt(i);
      if (vowels.contains(String.valueOf(ch))) {
        containsVowels = true;
        System.out.println("Given String contains vowels");
        break;
      }
    }
    if (!containsVowels) {
      throw new NoVowelsException("String does not contain any vowels.");
    }
  }
}
class NoVowelsException extends Exception {
  public NoVowelsException(String Error) {
    super(Error);
  }
}

