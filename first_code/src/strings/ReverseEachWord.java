package strings;
import java.util.Scanner;
public class ReverseEachWord {
	
	    
	    static String reverseWord(String inputString){
	        String[] strarray = inputString.split(" ");  // Spilt String by Space
	        StringBuilder sb = new StringBuilder();
	        for(String s:strarray){
	            if(!s.equals("")){
	               StringBuilder strB = new StringBuilder(s);
	               String rev = strB.reverse().toString();
	               sb.append(rev+" "); 
	            }    
	        }
	        return  sb.toString();
	        
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("input String : ");
	        String str = sc.nextLine();
	        System.out.println("Input String : "+str);
	        System.out.println("String with Reverese Word : "+reverseWord(str));
	    }
	    
	}


