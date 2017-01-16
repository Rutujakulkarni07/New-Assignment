import java.sql.*;
class JDBCDemo
{
		public static void main(String[] args)throws Exception
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.print("Driver Loaded");
			Connection con= DriverManager.getConnection("jdbc:odbc:test");
			System.out.print("Connection Established");
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
			pst.setString(1,args[0]);
			pst.setString(2,args[1]);
			pst.setString(3,args[2]);
			pst.executeUpdate();
			System.out.println("record inserted succesfully");
		pst.close();
		con.close();
			
		}
}