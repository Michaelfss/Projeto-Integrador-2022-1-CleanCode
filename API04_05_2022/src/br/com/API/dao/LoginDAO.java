package br.com.API.dao;


import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import segundo_semestre.br.com.clean_code.back.Login;

public class LoginDAO {
	
	

	private static final String USERNAME = "root";
	//Senha do banco
	private static final String PASSWORD="Agatha@21";
	//Caminho do banco de dados , porta , nome do banco de dados
	private static  String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/Usuario";
	
	
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Criar a conexao com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	public boolean consultar (String usuario, String senha) throws Exception{
		// Manda como parametro para ele duas variaveis para ele procurar no banco de dados!
		 
		            boolean autenticado = false;
		            String sql;
		            //    sql = "select usuario, senha from Cadastro where usuario ='"+usuario+"' and senha = '"+senha+"'";
		            sql = "select usuario, senha from Cadastro where usuario =? and senha =? ";
		            System.out.println(sql);
		         
		        	
		        	Connection con = createConnectionToMySQL();
		        	 
		            PreparedStatement pstm;
		 
		            pstm = (PreparedStatement) con.prepareCall(sql);
		            pstm.setString(1, usuario);
		            pstm.setString(2, senha);
		 
		            ResultSet rs;
		            rs = pstm.executeQuery();
		 
		            if (rs.next()) {
		                String usuarioBanco = rs.getString("usuario");
		                String senhaBanco = rs.getString("senha");
		                autenticado = true;
		            }
		 
		            pstm.close();
		   
		 
		            return autenticado;
		            
		            
		            
		            
		 
	}
		
	
	public void save(Login login) throws Exception {
	String sql= "INSERT INTO cadastro(usuario,senha)values(?,?)";
	
	
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
			conn = createConnectionToMySQL();
			
			//Criamos uma Preparedtatement, para executar um query
					
			 
			pstm = (PreparedStatement) conn.prepareCall(sql);
			//Adicionar os valores que são esperados pela query
		pstm.setString(1,login.getUsuario());
		pstm.setString(2,login.getSenha());
		
		

		//Executar a query
		pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//Fechar as conexõoes
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
