import java.util.Scanner;
public class ArrayElementSum {
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);

			int n,sum = 0;

			System.out.print("Enter the elements you want : ");

			n = s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter the elements:");

			for (int i=0; i<n; i++)
			{
				a[i] = s.nextInt();
			}
			for( int num : a) 
			{
				sum = sum+num;
			}
			
			System.out.println("Sum of array elements is :" +sum);
		}
	}


