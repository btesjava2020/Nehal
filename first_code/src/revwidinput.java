import java.util.Scanner;
public class revwidinput {
public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,rem,rev=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number to get reverse");
 n= s.nextInt();
while(n!=0) {
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println(rev);
	
	}
}
