

package jdbc;


/*
 Following are the fundamental steps in JDBC.
 
1. import JDBC packages.

2. Load and register the JDBC driver.

3. Open a connection to the database.

4. Create a statement object to perform a query.

5. Execute the statement object and return a query resultset.

6. Process the resultset.

7. Close the resultset and statement objects.

8. Close the connection.

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

or
import java.sql.*;
*/
import java.sql.*;

public class jdbcrunner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sudip";
		String user="root";
		String pass="kribond5";
		String query="select name from employees where id=1" ;
		Connection con=null;
		try {
		 con =   DriverManager.getConnection(url,user,pass);
		if(con!=null)
		{
			System.out.println("connected");
		}
		}catch(Exception e)
		{
			System.out.println("not connected");
		}
		
		
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery(query);
		
		rs.next();//takes you to next value.
		String name= rs.getString("name");
		System.out.println(name);
		st.close();
		con.close();
	}

}

