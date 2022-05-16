package DAO;

import java.sql.PreparedStatement;

import com.example.view.Factory.ConnectionFactory;

import DTO.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClienteDAO {
    private static final String USERNAME = "root";
	private static final String PASSWORD= "1qaz2wsx3edc";
	private static  String DATABASE_URL= "jdbc:mysql://localhost:3306/ativacaoclientedomrock";

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	
		return connection;
	}

	public void save(Cliente cliente) throws Exception {
		String sql = "INSERT INTO cliente(Cli_Entregaveis_Possiveis, Cli_Objetivo_Negocio, Cli_Entregaveis_Minimos, Cli_Setor, Cli_Razao_Social, Cli_CNPJ, Cli_Nome) VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		 Connection con = createConnectionToMySQL();
		 
		 if(con != null) {
			 System.out.println("Conexão obtida com sucesso!");
			 con.close();
		 }
         try {
			conn = ConnectionFactory.createConnectionToMySQL();
								 
			pstm = (PreparedStatement) conn.prepareCall(sql);

		pstm.setString(1,cliente.getEntregaveisPossiveis());
		pstm.setString(2,cliente.getObjetivoNegocio());
		pstm.setString(3,cliente.getEntregaveisMinimos());
		pstm.setString(4,cliente.getSetor());
		pstm.setString(5,cliente.getRazaoSocial());
		pstm.setString(6,cliente.getCnpj());
		pstm.setString(7,cliente.getCliente());

		pstm.execute();
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	    }
    }
}
