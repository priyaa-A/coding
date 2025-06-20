public class Commonele
{
	public static void main(String args[])
	{
		String [] a= {"priya","saranya","theju","poshika"};
		String [] b= {"sivashree","priya","saranya","sangeetha"};
		//int[] c=new int[2];
		int i;
		
		for ( i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
				  System.out.println("the common elements are:"+a[i]+ "at index"+i);
				  
			    }
			}
			
	
		
	   }
		
	}
	
}
