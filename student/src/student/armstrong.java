package student;

public class armstrong
{
	public static void main(String[] args)
	{
int a, c=0,temp,n=370;
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);

}
if (temp==c)
	System.out.println("Armstrong number");
else
	System.out.println("Not Armstrong number");

	
	}

}
