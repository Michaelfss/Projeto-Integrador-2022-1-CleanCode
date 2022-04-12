package br.com.API.factory;



import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionFactory {
	//Nome do usuario do mmysql
	private static final String USERNAME = "root";
	//Senha do banco
	private static final String PASSWORD="Agatha@21";
	//Caminho do banco de dados , porta , nome do banco de dados
	private static  String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/root=Agatha@21";
	
	/*
	 * Conexão com o banco de dados
	 */
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Criar a conexao com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	 public static void main(String[]  args) throws Exception  {
		 //Recuoperar uma conexao com banco de dados 
		 Connection con = createConnectionToMySQL();
		 
		 // Testar se a conexao é nula
		 if(con!=null) {
			 System.out.println("Conexão obtida com sucesso!");
			 con.close();
		 }
	 }

}
