package strings;
import java.util.Scanner;
public class compareToString {

		public static void main(String args[])
		{
			
			String str1,str2;
	 
			Scanner in = new Scanner(System.in);

		
			System.out.print("Enter first string: ");
			str1 = in.nextLine();
			System.out.print("Enter second string: ");
			str2 = in.nextLine();

		
			if(str1.compareTo(str2)==0)
				System.out.println("Strings are equal.");
			else
				System.out.println("Strings are not equal.");
		}
	}


