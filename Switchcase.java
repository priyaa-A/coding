//package priyaa_java;
import java.util.Scanner;

public class NestedSwitchtask {
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welocome you!!!!, please enter your screen number(1,2,3,4): ");
		int Screen=scan.nextInt();
		System.out.println("thanks for entering your screen number, please enter your movie timing(7am,11am,2pm,6pm): ");
		int Timing=scan.nextInt();
		switch(Screen)
		{
		case 1:
			switch(Timing)
			{
			case 7:
				System.out.println("thankyou for your acknowledment!!");
				System.out.println("you booked  THUG LIFE");
				break;
				
			case 11:
				System.out.println("thankyou for your acknowledgement!!");
				System.out.println("you booked MAMAN");
				break;
			
		    case 2:
		    	System.out.println("thankyou for your aknowledgement!!");
		    	System.out.println("you booked TOURIST FAMILY");
		        break;
		       
		    case 6:
		    	System.out.println("thankyou for your acknowledgement!!");
		    	System.out.println("you booked HIT");
		    	break;
			}
			break;
		case 2:
			switch(Timing)
			{
			case 7:
				System.out.println("thankyou for your acknowledment!!");
				System.out.println("you booked  Inception");
				break;
				
			case 11:
				System.out.println("thankyou for your acknowledgement!!");
				System.out.println("you booked Interstellar ");
				break;
			
		    case 2:
		    	System.out.println("thankyou for your aknowledgement!!");
		    	System.out.println("you booked A Quiet Place ");
		        break;
		       
		    case 6:
		    	System.out.println("thankyou for your acknowledgement!!");
		    	System.out.println("you booked The Fault in Our Stars ");
		    	break;
			}
			break;
		case 3:
			switch(Timing)
			{
			case 7:
				System.out.println("thankyou for your acknowledment!!");
				System.out.println("you booked  Anniyan");
				break;
				
			case 11:
				System.out.println("thankyou for your acknowledgement!!");
				System.out.println("you booked SILUNU OUR KADHAL");
				break;
			
		    case 2:
		    	System.out.println("thankyou for your aknowledgement!!");
		    	System.out.println("you booked KANNA");
		        break;
		       
		    case 6:
		    	System.out.println("thankyou for your acknowledgement!!");
		    	System.out.println("you booked GOOD BAD UGLY");
		    	break;
			}
			break;
		case 4:
			switch(Timing)
			{
			case 7:
				System.out.println("thankyou for your acknowledment!!");
				System.out.println("you booked  SOORARAI PORTRU");
				break;
				
			case 11:
				System.out.println("thankyou for your acknowledgement!!");
				System.out.println("you booked THUPAKI");
				break;
			
		    case 2:
		    	System.out.println("thankyou for your aknowledgement!!");
		    	System.out.println("you booked JILLA");
		        break;
		       
		    case 6:
		    	System.out.println("thankyou for your acknowledgement!!");
		    	System.out.println("you booked CAPTAIN MILLER");
		    	break;
			}
			break;
			
			
		
  

}
}
	}
