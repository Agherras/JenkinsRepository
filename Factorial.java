import java.util.*;
class Factorial
{
	static Date date = new Date();
	public static void main(String arg[])	
	{
             	int n=5,fact=1;
 
	        for(int i=1;i<=n;i++)
	  	  {
 
	    	   fact=fact*i;
 	 	  }
 
 	        System.out.println("factoral="+fact);
			
           System.out.println("Today is " + date);
	}
}