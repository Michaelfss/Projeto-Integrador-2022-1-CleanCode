package com.example.view.Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME = "root";
	private static final String PASSWORD="1qaz2wsx3edc";
	private static  String DATABASE_URL="jdbc:mysql://localhost/ativacaoclientedomrock";


	public static Connection createConnectionToMySQL() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			
		return connection;
	}
		
	public static void main(String[]  args) throws Exception  {
		Connection con = createConnectionToMySQL();
			 
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
}
