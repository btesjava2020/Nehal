import java.util.Scanner;
public class palindrome {
public static void main(String[] args){
int rev=0,rem;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int temp=n;
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
		if (n==rev) {
			System.out.println( n+":"+ " given number is palindrome");
		}
		else {
			System.out.println( n+":"+ "given number is not palindrome");
		}
		
	}
}

