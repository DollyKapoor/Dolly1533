package student;
 import java.util.*;
 


public class prime 
{
public static void main(String args[])
{
	 int counter;
	    long factorials = 1;
	    int limit;
	    System.out.println("enter limits");
	    
	    Scanner s=new Scanner(System.in);
	    limit=s.nextInt();
	    
	    

	  System.out.printf("%4s%30s\n", "Number", "Factorials");

	    for (counter = 1; counter <= limit; factorials *= counter, counter++)
	        System.out.printf("%4d%,30d\n", counter, factorials);

	  }
	}




