import java.sql.*;
import java.util.Scanner;

public class TestJDBC {
	
	final String url = "jdbc:mysql://localhost:3306/JDBC?useUnicode=true&characterEncoding=UTF-8";
	final String username = "root";
	final String password = "Kunal@123";
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	
	public TestJDBC() {
		try (
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(url,username,password)
		);
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createTable() {
		
		try {
			stmt = con.createStatement();
			stmt.execute("CREATE TABLE employee (name VARCHAR(20), age INT(2),city VARCHAR(20));");
			System.out.println("Table Created.!");
		} catch (SQLSyntaxErrorException e) {
			System.out.println("Table already exists.!");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void modifyTable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the new Size for name Column : ");
		int newSize = sc.nextInt();	
		try {
			stmt = con.createStatement();
			stmt.execute("ALTER TABLE employee MODIFY COLUMN name VARCHAR("+newSize+");");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Column Modified..!");
	}
	
	public void dropTable() {
		
		try {
			stmt = con.createStatement();
			stmt.execute("DROP TABLE employee;");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Table Dropped.!");

	}
	
	public int insertRecord() {
		
		int updateCount = 0;
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		
		try {
			pStmt = con.prepareStatement("INSERT INTO employee values(?,?,?);");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		do {
			System.out.print("\nEnter Employee Name : ");
			name = sc.next();
			System.out.print("Enter Employee Age : ");
			age = sc.nextInt();
			System.out.print("Enter Employee City : ");
			city = sc.next();
			
			try {
				pStmt.setString(1, name);
				pStmt.setInt(2, age);
				pStmt.setString(3, city);
				updateCount = updateCount + pStmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.print("Do you want to Insert Record Again [y/n] : ");
		}while(sc.next().equalsIgnoreCase("y"));
		
		System.out.println(updateCount+" Records Inserted.!");
		return updateCount;
	}
	
	public void removeAll() {
		try {
			stmt = con.createStatement();
			stmt.execute("TRUNCATE TABLE employee;");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Removed All Records.!");

	}
	
	public boolean updateRecord() {
		Scanner sc = new Scanner(System.in);
		int isUpdated = 0;
		
		
		System.out.print("\nEnter Employee Name to Update Record : ");
		String name = sc.next();
		System.out.print("Enter Employee Age : ");
		int age = sc.nextInt();
		System.out.print("Enter Employee City :");
		String city = sc.next();
		
		try {
			pStmt = con.prepareStatement("UPDATE employee SET age = ?,city = ? WHERE name = ?");
			pStmt.setString(3,name);
			pStmt.setInt(1, age);
			pStmt.setString(2, city);
			isUpdated = pStmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		if(isUpdated <= 0) {
			System.out.println("No Records Updated.!");
			return true;
		}
		else {
			System.out.println("Record Updated.!");
			return false;
		}
			
	}
	
	public void showRecords() {
		
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employee;");
			System.out.println("Name"+"\t"+"Age"+"\t"+"City");
			System.out.println("---------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public boolean deleteRecords() {
		
		Scanner sc = new Scanner(System.in);
		int isDeleted = 0;
		
		
		System.out.print("\nEnter Employee Name to Delete Record : ");
		String name = sc.next();
		
		try {
			pStmt = con.prepareStatement("DELETE FROM employee WHERE name = ?");
			pStmt.setString(1,name);
			isDeleted = pStmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		if(isDeleted <= 0) {
			System.out.println("No Records Deleted.!");
			return true;
		}
		else {
			System.out.println("Record Deleted.!");
			return false;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		TestJDBC jdbc = new TestJDBC();
		
		
		do {
			System.out.println("--------------------");
			System.out.println("->1 : Create Table ");
			System.out.println("->2 : Modify Column ");
			System.out.println("->3 : Drop Table ");
			System.out.println("->4 : Insert Records");
			System.out.println("->5 : Update Record ");
			System.out.println("->6 : Delete Record ");
			System.out.println("->7 : Remove All Records");
			System.out.println("->8 : Show Records");
			System.out.print("\n->Enter Choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					jdbc.createTable();
					break;
				case 2:
					jdbc.modifyTable();
					break;
				case 3:
					jdbc.dropTable();
					break;
				case 4: 
					jdbc.insertRecord();
					break;
				case 5:
					jdbc.updateRecord();
					break;
				case 6:
					jdbc.deleteRecords();
					break;
				case 7:
					jdbc.removeAll();
					break;
				case 8:
					jdbc.showRecords();
					break;
				default:
					System.out.println("Invalid Choice");
					
			}
			
			System.out.print("\nDo you want to main Menu [y/n]: ");
		}while(sc.next().equalsIgnoreCase("y"));
		
		jdbc.closeConnection();
		System.out.println("Exited..!");
	}
	
}

