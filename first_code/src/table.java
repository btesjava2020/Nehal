import java.util.Scanner;
 class table {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.print("enter the number");
	int num=input.nextInt();
	for(int i=0;i<=10;i++) {
	System.out.println(num + " * " + i + " = " + num*i);
	} 
	
	}
}
