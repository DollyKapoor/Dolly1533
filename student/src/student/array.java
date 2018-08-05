package student;
import java.util.*;

public class array
{

	public static void main(String args[])
	
	{
		int size;
		Scanner S=new Scanner(System.in);
		System.out.println("enter the size");
		size=S.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<=size;i++)
		{
			arr[i]=S.nextInt();
		}
			System.out.println("the numbers are");
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
		}
	}
	
	}


