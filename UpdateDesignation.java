import java.sql.*;
class UpdateDesignation
{
	public static void main(String[]args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("Jdbc:Odbc:test");
		PreparedStatement pst=con.prepareStatement("update employee set designation=? where edept=?");
		pst.setString(1,args[0]);
		pst.setString(2,args[1]);
		pst.executeUpdate();
		pst.close();
		con.close();
	}
}