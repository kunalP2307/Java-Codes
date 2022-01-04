import java.sql.*;
import java.lang.ClassNotFoundException;

public class TestJDBC {
	public static void main(String args[]) {
	
		String url = "jdbc:mysql://localhost:3306/JDBC?useUnicode=true&characterEncoding=UTF-8";
		String username = "root";
		String password = "Kunal@123";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to Database : ");
			
			Statement st = connection.createStatement();
			String sql = "CREATE TABLE login (uname varchar(20),upass varchar(20))";
			st.execute();
			
			ResultSet rs = st.executeQuery("Select * from login_creds;");
			
			System.out.println("\nUsername"+"\t"+"Password");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
		
			connection.close();	
		}catch(SQLException | ClassNotFoundException e){}
	}	
}
