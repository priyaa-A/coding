public class Palindrome {
	
	    public static void main(String[] args) {
	        int number = 141;
	        int number2=number;
	        int rev=0;
	        while(number2!=0)
	        {
	        	rev=(rev*10)+number2%10;
	        	number2=number2/10;
	        }
	        
	        
	        if(number==rev)
	        {
	        	System.out.println("it is a palindrome");
	        }
	        else
	        {
	        	System.out.println("it is not a palindrome");
	        }
	        }
}
	        