import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	static Connection con=null;
	public static Connection getMyConnection() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //com.mysql.cj.jdbc.Driver  //oracle.jdbc.driver.OracleDriver
			 
//step2 create  the connection object 
			 
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce1","root","MAhi@0025");  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return con;
		
		}

}

