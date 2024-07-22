package task_23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1:Database Connection details
		
		String database_url = "jdbc:mysql://localhost:3306";
		
		String user = "root";
		
		String password = "root";
		
		//Establish the connection
		
		try {
			Connection connection = DriverManager.getConnection(database_url, user, password);
		
		
		//check connection is established
		
		if(connection != null) {
			
			System.out.println("Connection is successful");
		}else {
			
			System.out.println("Connection is not successful");
		}
		
		//Perform Operation
		Statement stmt = connection.createStatement();
		String DBcreate = "create database Employee_details";
		String use = "use Employee_details";
		String createtable = "create table Emptable (empcode int,empname varchar(20),empage int,esalary int)";
		String insert = "insert into Emptable values (101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000)";
		String select = "select * from Emptable";
		//Execute the statements
		
		stmt.execute(DBcreate);
		
		stmt.execute(use);
		
		stmt.execute(createtable);
		
		stmt.executeUpdate(insert);
		
		
		//Selecting the data
		ResultSet rs = stmt.executeQuery(select);
		
		//iterate the result
		
		while(rs.next()) {
			
			System.out.println(rs.getInt("empcode")+" "+rs.getString("empname")+" "+rs.getInt("empage")+" "+rs.getInt("esalary"));
		}
		
		//close the connection
		
		connection.close();		
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
