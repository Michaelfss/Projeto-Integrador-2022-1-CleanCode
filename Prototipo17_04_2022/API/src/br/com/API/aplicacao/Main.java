package br.com.API.aplicacao;





import br.com.API.dao.ClienteCadastroDAO;
import br.com.API.dao.LoginDAO;

import segundo_semestre.br.com.clean_code.back.ClienteCadastro;
import segundo_semestre.br.com.clean_code.back.Login;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ClienteCadastroDAO clientecadastroDao = new ClienteCadastroDAO();
		LoginDAO loginDAO = new LoginDAO();
		
		
		Login login = new Login("","");
        ClienteCadastro clientecadastro = new ClienteCadastro("","","","","");
        
       
        
        clientecadastroDao.save(clientecadastro);
        loginDAO.save(login);
        
        
      
        	
        	
        }
	
	
		}
		
		
		

	


