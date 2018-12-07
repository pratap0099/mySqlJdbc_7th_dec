package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlConnection {

	public static void main(String[] args) {

		try {
			/*Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=master;instance=SQLSERVER;encrypt=true;TrustServerCertificate=true";
			Connection con = DriverManager.getConnection(url, "sa", "pratap039");
			String query = " SELECT * FROM testTable";
			Statement myStatement = con.createStatement();
			ResultSet result = myStatement.executeQuery(query);
			while (result.next()) {
				System.out.println("id is " + result.getInt("id"));
				System.out.println("name is " + result.getString("name"));
			}
*/
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=master;integratedSecurity=false","pratap-PC\\pratap","dada");
			String query = " SELECT * FROM MyTable";
			Statement myStatement = con.createStatement();
			ResultSet result = myStatement.executeQuery(query);
			while (result.next()) {
				System.out.println("id is " + result.getInt("id"));
				System.out.println("name is " + result.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
