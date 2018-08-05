package student;
import java.util.*;

public class comparestring
{
public static void main(String [] args)

{
	String s1, s2;
	
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter the first string");
    s1 = Sc.nextLine();

    System.out.println("Enter the second string");
    s2 = Sc.nextLine();
    if ( s1.compareTo(s2) > 0 )
        System.out.println("First string is greater than second.");
     else if ( s1.compareTo(s2) < 0 )
        System.out.println("First string is smaller than second.");
     else   
        System.out.println("both strings are equal");
}
}
