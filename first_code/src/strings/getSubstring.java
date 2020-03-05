package strings;
import java.util.Scanner;
public class getSubstring {

		public static void main(String args[]) throws Exception
		{
			Scanner sc=new Scanner(System.in);
			String str="";
			
			int startIndex,endIndex;
 
			System.out.print("Enter the string: ");
			str=sc.nextLine();
		
			System.out.print("Enter start index: ");
			startIndex=sc.nextInt();
			System.out.print("Enter end index: ");
			endIndex=sc.nextInt();

			String temp;
			temp= str.substring(startIndex, endIndex);
			System.out.println("Substring is: "+temp);
		}
	}


