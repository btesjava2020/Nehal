import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123,rem,rev=0;
//Scanner s=new Scanner(System.in);
//System.out.println("enter the number to get reverse");
//int n= s.nextInt();
while(n!=0) {
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println(rev);
	
	}
}
