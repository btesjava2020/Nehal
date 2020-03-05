package strings;

public class StringpPalindrome {
		public static void main(String[] args) {
			String mystring="nehal";
			StringBuffer buffer=new StringBuffer(mystring);
			buffer.reverse();
			String data=buffer.toString();
			if(mystring.equals(data)) {
				System.out.println("given string is palindrome");
			}
			else
				System.out.println("given string is not pallindrome");
		}
	}

