package br.com.API.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.API.factory.ConnectionFactory;
import segundo_semestre.br.com.clean_code.back.ClienteCadastro;


import java.sql.Connection;
import java.sql.DriverManager;




public class ClienteCadastroDAO {
	/*
	 * CRUD
	 * c: CREATE
	 * r: READ
	 * u: UPDATE
	 * d: DELETE
	 */
	
	

	/*
	 * Conexão com o banco de dados
	 */
	
	
	private static final String USERNAME = "root";
	//Senha do banco
	private static final String PASSWORD="Agatha@21";
	//Caminho do banco de dados , porta , nome do banco de dados
	private static  String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/Cadastro_cliente";
	
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Criar a conexao com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public ArrayList <ClienteCadastro> getLista(String cnpj) throws Exception {
		ArrayList<ClienteCadastro> turma = new ArrayList<ClienteCadastro>();
		
		Connection conn=null;
		PreparedStatement pstm =null;
		Connection con = createConnectionToMySQL();
		 
		 // Testar se a conexao é nula
		 if(con!=null) {
			 System.out.println("Conexão obtida com sucesso!");
			 con.close();
		 }
		 
		try {
			
		
		
		pstm = con.prepareStatement("select * from cadastros where cnpj="+cnpj);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) 
		{
			ClienteCadastro clientecadastro = new ClienteCadastro();
			clientecadastro.setRazaoSocial(rs.getString("razao social"));
			clientecadastro.setCnjp(rs.getString("cnpj"));
			clientecadastro.setEndereco(rs.getString("endereco"));
			clientecadastro.setNumero(rs.getString("numero"));
		    clientecadastro.setCEP(rs.getString("cep"));
			turma.add(clientecadastro);
		}
		   rs.close();
		   pstm.close();
		   
		
		} catch (SQLException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally
		{
			con.close();
			
		}
		return turma;
		
	}	
	public void save(ClienteCadastro clientecadastro) throws Exception {
		String sql= "INSERT INTO cadastros(razao_social,cnpj,endereco,numero,cep)  VALUES(?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstm =null;
		
		 Connection con = createConnectionToMySQL();
		 
		 // Testar se a conexao é nula
		 if(con!=null) {
			 System.out.println("Conexão obtida com sucesso!");
			 con.close();
		 }
		
		try {
			//Criar uma conexao com banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma Preparedtatement, para executar um query
					
			 
			pstm = (PreparedStatement) conn.prepareCall(sql);
			//Adicionar os valores que são esperados pela query
		pstm.setString(1,clientecadastro.getRazaoSocial());
		pstm.setString(2,clientecadastro.getCnjp());
		pstm.setString(3,clientecadastro.getEndereco());
		pstm.setString(4,clientecadastro.getNumero());
		pstm.setString(5,clientecadastro.getCEP());
		

		//Executar a query
		pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//Fechar as conex~oes
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
