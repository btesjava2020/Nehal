import java.util.Scanner;
public class prime {
public static void main(String[] args){
	int i,temp=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	for(i=2;i<=n-1;i++) {
  if(n%i==0 ) {
	  temp=temp+1;
	  }
	}
	if(temp>0) {
		System.out.println("given number"+" " + n+" " + "is  prime");
		}
	
	else {
		System.out.println("given number"+" "  + n +" "+"is not prime");
	}
}
}
