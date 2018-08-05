package student;
import java.util.*;
public class fact {
public static void main(String args[])
{
	int counter;
	long factorial=1;
	int limit;
	System.out.println("enter the limits");
	Scanner S=new Scanner(System.in);
	 limit=S.nextInt();
	    
	    

	  System.out.printf("%4s%30s\n", "Number", "Factorials");

	    for (counter = 1; counter <= limit; factorial *= counter, counter++)
	        System.out.printf("%4d%,30d\n", counter, factorial);

	  
	

}
}
