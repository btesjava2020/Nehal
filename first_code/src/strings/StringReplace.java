package strings;

public class StringReplace {
		public static void main(String args[])
		{
			String str1="www.btes.com";
			
			String str2="Hello World!";

			System.out.println("Strings before replacing:");
			System.out.println("str1: "+str1 +"\nstr2:" + str2);
			
		
			str1=str1.replace(str1, str2);

			
			System.out.println("Strings after replacing:");
			System.out.println("str1: "+str1 +"\nstr2:" + str2);
		}
	}


