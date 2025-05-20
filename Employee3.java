package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java13132","root","route");
			Statement stmt=con.createStatement();
			String sql="delete from Emp where eno=106";
			stmt.executeUpdate(sql);
			System.out.println("Recored Deleted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
