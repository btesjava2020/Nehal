
public class duplicate 
{ 

	public static void main(String[] args) 
	{ 
		
		int arr[] = {1,2,3,3,4,5,5}; 
		int n = arr.length;
		int i, j; 
		System.out.println("Repeated Elements are :"); 
		for (i = 0; i < n; i++) 
		{ 
			for (j = i +1; j < n; j++) 
			{ 
				if (arr[i] == arr[j]) 
					System.out.print(arr[i] + " "); 
				
			}
		}
	} 
} 
