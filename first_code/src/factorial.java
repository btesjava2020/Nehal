import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
	int i,fact=1 ;	// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();

for( i=1;i<=n;i++) {
  fact=fact*i;
}
	System.out.println(fact);
	}

}
