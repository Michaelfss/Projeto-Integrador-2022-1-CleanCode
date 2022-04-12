package br.com.API.aplicacao;

import br.com.API.dao.ClienteCadastroDAO;
import segundo_semestre.br.com.clean_code.back.ClienteCadastro;

public class Main {

	public static void main(String[] args) {
		
		ClienteCadastroDAO clientecadastroDao = new ClienteCadastroDAO();
		
        ClienteCadastro clientecadastro = new ClienteCadastro(null, null, null, null, null);
        clientecadastro.setRazaoSocial(null);
        clientecadastro.setNumero(null);
        clientecadastro.setEndereco(null);
        clientecadastro.setCnjp(null);
        clientecadastro.setCEP(null);
        
       
        clientecadastroDao.save(clientecadastro);
        	
        	
        }
		
		
		

	

}
