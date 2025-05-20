package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java13132","root","route");
		Statement stmt=con.createStatement();
		String sql="select * from Emp";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println();
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getInt(4));
		}
	
}
		catch (Exception e)	{
			System.out.println(e);
		}
	}
}


