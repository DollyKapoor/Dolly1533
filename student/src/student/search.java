package student;

import java.util.Scanner;

public class search
{

	public static void main(String args[]) 
	{
		int size,flag=0;
			int min=0,max=0,i;
			Scanner S=new Scanner(System.in);
			System.out.println("enter the size");
			size=S.nextInt();
			int arr[]=new int[size];
			System.out.println("enter the numbers");
			for(i=0;i<size;i++)
			{
				arr[i]=S.nextInt();
			}
			System.out.println("enter the no.to search");
			int find=S.nextInt();
			for(i=0;i<size;i++)
			{
				if(find==arr[i])
				{
			 flag=1;
					
				}
				else
				{
					flag=0;
					
				}
			}
			if(flag==1)
			{
				System.out.println("number found "+find);
				
			}
			else
			{
				System.out.println(find+ "   not found");
			}
		
			
			}

}
