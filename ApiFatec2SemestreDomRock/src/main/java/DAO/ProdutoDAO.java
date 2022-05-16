package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProdutoDAO {

	private static final String USERNAME = "root";
	private static final String PASSWORD= "1qaz2wsx3edc";
	private static  String DATABASE_URL= "jdbc:mysql://localhost:3306/ativacaoclientedomrock";

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	
		return connection;
	}

	public void save(Cliente cliente) throws Exception {
		String sql = "INSERT INTO cliente(Cli_Entregaveis_Possiveis, Cli_Objetivo_Negocio, Cli_Entregaveis_Minimos, Cli_Setor, Cli_Razao_Social, Cli_CNPJ, Cli_Nome, Cli_Id) VALUES(?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		 Connection con = createConnectionToMySQL();
		 
		 // Testar se a conexao é nula
		 if(con != null) {
			 System.out.println("Conexão obtida com sucesso!");
			 con.close();
		 }
	}
}