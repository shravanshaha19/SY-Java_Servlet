package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java13132","root","route");
			Statement stmt=con.createStatement();
			String sql="insert into Emp values(105,'Rehan','TYBBA(C.A)',20000)";
			stmt.executeUpdate(sql);
			System.out.println("Recored insert successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
