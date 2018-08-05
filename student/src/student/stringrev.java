package student;

public class stringrev
{
	static int i,c=0,rev;
	static void stringreverse(String s)
	{
		char ch[]=new char[s.length()];
		for(i=0;i<s.length();i++)
		
			ch[i]=s.charAt(i);
			for(i=s.length()-1;i>=0;i--)
			
				System.out.print(ch[i]);
				
			
			
		}
		
	
	
	public static void main(String[] args)
	{
		System.out.println("original string is");
		System.out.println("lakhan");
		stringrev.stringreverse("lakhan");
		
	}

}
