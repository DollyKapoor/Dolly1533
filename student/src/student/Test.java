package student;
import java.util.*;

public class Test {

	int id;
	float s1,s2,s3,s4,s5;
	float result,avg;
	float attendance, cal;
	String name;
	Scanner S=new Scanner(System.in);
	public void fill_details()
	{
		System.out.println("Enter the student details");
		System.out.println("Enter name");
		name =S.next();
		System.out.println("Enter id");
		id=S.nextInt();
		System.out.println("Enter marks of 5 subject");
		s1=S.nextFloat();
		s2=S.nextFloat();
		s3=S.nextFloat();
		s4=S.nextFloat();
		s5=S.nextFloat();
		System.out.println("Enter attendance");
		 attendance=S.nextFloat();
	}
	public Float cal_attendance()
	{
		cal= (attendance/30)*100;
		return cal;
	}
	public Float cal_result()
	{
		result=s1+s2+s3+s4+s5;
		Float avg = result/5;
		return result;
		
	}
public void display()
{
	System.out.println("name "+name);
	System.out.println("id "+id);
	System.out.println("avg "+result/5);
	System.out.println("result "+result);
	System.out.println("attendance "+attendance);
}
public static void main(String [] args)
{
	Test o = new Test();
	o.fill_details();
	o.cal_attendance();
	o.cal_result();
	o.display();
}
}

