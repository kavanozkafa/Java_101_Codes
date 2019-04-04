package mysqlConnection;

import java.sql.*;

//add mysql-connector-java-8.0.15 library to external libraries

public class mysqlConnection {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/mall?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey"
					,"root","password");
		
			
			Statement sqlState = con.createStatement();
			String select = "select * from bim";
			ResultSet rows = sqlState.executeQuery(select);
			
			
			while(rows.next()) {
				System.out.println(rows.getString("product"));
			}
			
		}
		catch(SQLException ex) {
			System.out.println("Ooops ! -> "+ ex.getMessage() +"error code -->" + ex.getErrorCode());
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	}
}
