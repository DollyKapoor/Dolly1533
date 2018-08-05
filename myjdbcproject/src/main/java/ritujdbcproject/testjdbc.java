package ritujdbcproject;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.*;
	import java.sql.PreparedStatement;	
	
	

	public class testjdbc {

	public static void main(String[] args)
	{
	try
	{
	Connection dconn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa@123");
	   System.out.println("enter name");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name = br.readLine();
	System.out.println("enter age");
	int age = Integer.parseInt(br.readLine());
	String qry = "insert into emp values(?,?)";
	PreparedStatement ps = conn.prepareStatement(qry);
	ps.setString(1, name);
	ps.setInt(2, age);
	ps.execute();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}

	}
	
