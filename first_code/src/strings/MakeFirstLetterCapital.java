package strings;
import java.util.Scanner;
public class MakeFirstLetterCapital {
	
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter sentence here : ");
			String line = in.nextLine();
			String upper_case_line = ""; 
			Scanner lineScan = new Scanner(line); 
			while(lineScan.hasNext())
			{
				String word = lineScan.next(); 
				upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
			}
			System.out.println("Original sentence is : " +line); 
			System.out.println("Sentence after convert : " +upper_case_line.trim()); 
		}
	}


