package student;

import java.util.Scanner;

public class arr 
{
public static void main(String args[])
{
	int size;
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
	max=arr[0];
	for(i=0;i<size;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}}
	System.out.println("biggest no.is="+max);
	min=arr[0];
	for(i=0;i<size;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
		System.out.println("smallest no.is="+min);
	}
}
	
				
		
			
	
	
	
	
	


