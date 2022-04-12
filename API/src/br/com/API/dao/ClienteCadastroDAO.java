package br.com.API.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.API.factory.ConnectionFactory;
import segundo_semestre.br.com.clean_code.back.ClienteCadastro;

public class ClienteCadastroDAO {
	/*
	 * CRUD
	 * c: CREATE
	 * r: READ
	 * u: UPDATE
	 * d: DELETE
	 */

	public void save(ClienteCadastro clientecadastro) {
		String sql= "INSERT INTO cadastros(razao_social,cnpj,endereco,numero,cep)  VALUES(?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstm =null;
		
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
