package student;

public class prime1 
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=2;i<=50;i++)
		{
			k=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=1;
					break;
					
				}
		
			}
			if(k==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
