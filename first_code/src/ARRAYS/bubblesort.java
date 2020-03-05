package ARRAYS;

public class bubblesort {

	public static void main(String[] args) {
		  
    int[] a= {40,10,20,30,50};
    int temp;
 for(int i=0;i<a.length;i++) {
	    int flag=0;
	 for(int j=0;j<a.length-1;j++) {
		 if(a[j]>a[j+1]) {
			temp=a[j];
		 a[j]=a[j+1];
		 a[j+1]= temp;
		  flag=1;}
	 }
 
	 if ( flag==0) {
		 break;
	 }
	 for(i=0;i<=4;i++)
	 System.out.print(a[i]+" ");
	}}}










	


