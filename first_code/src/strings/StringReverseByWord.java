package strings;
import java.util.Scanner;
import java.util.StringTokenizer; 
public class StringReverseByWord { 
	public static void main(String[] args) 
		{
			String S;
			
			Scanner scan = new Scanner (System.in);
			System.out.print("Enter the string : ");

			S = scan.nextLine();
			
			StringTokenizer st = new StringTokenizer(S, " ");
			String strReversedLine = "";
			try
			{
				while(st.hasMoreTokens())
				{
					strReversedLine = st.nextToken() + " " + strReversedLine;
				}
				System.out.println("Reversed string by word is : " + strReversedLine);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


