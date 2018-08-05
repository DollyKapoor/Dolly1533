// Capitalize first word 
package student;

import java.util.Scanner;

public class firstlettercapital
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String S=ob.nextLine();
		 S=" "+S;
	        String cap="";
	        for(int i=0;i<S.length();i++)
	        {
	        	char x=S.charAt(i);
	            if(x==' ')
	            {
	                cap=cap+" ";
	                char y=S.charAt(i+1);
	        
	            cap=cap+Character.toUpperCase(y);
            i++;
        }
        else
        {
            cap=cap+x;
          
        }
        
	}
	        System.out.println("The new String with capital letters is: "+"\n"+cap);
    
}
}

	


