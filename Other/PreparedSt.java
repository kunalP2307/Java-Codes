import java.sql.*;
import java.lang.ClassNotFoundException;
import java.util.Scanner;

public class PreparedSt {
	public static void main(String args[]) {
	
		String url = "jdbc:mysql://localhost:3306/JDBC?useUnicode=true&characterEncoding=UTF-8";
		String username = "root";
		String password = "Kunal@123";
		Scanner sc = new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to Database : ");
			
			Statement st = connection.createStatement();
			//st.execute("CREATE TABLE login (uname varchar(20),upass varchar(20));");
			
			PreparedStatement pst = connection.prepareStatement("INSERT INTO login 										values(?,?)");
			/*System.out.print("Enter Username : ");
			String uname = sc.next();	
			System.out.print("Enter Password : ");
			String upass = sc.next();*/
			
			
			pst.setString(1,"def");
			pst.setString(2,"qwe");
			
			int updateCount = pst.executeUpdate();
			
			System.out.println(updateCount+" Recoreds Affected");
			sc.next();
			
			System.out.println("Update");
			
			pst = connection.prepareStatement("UPDATE login set upass = ? 										where uname=?");
			pst.setString(1,"newPass");
			pst.setString(2,"def");
			
			updateCount = pst.executeUpdate();
			
			System.out.println(updateCount+" Recoreds Affected");
		
			connection.close();	
		}catch(SQLException | ClassNotFoundException e){}
	}	
}
