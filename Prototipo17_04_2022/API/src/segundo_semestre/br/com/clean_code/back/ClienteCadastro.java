package segundo_semestre.br.com.clean_code.back;

public class ClienteCadastro {
	protected String RazaoSocial;
	protected String CNPJ;
	protected String Endereco;
	protected String Numero;
	protected String CEP;
	
	
	public ClienteCadastro(String RazaoSocial, String CNPJ, String Endereco, String Numero,String CEP) {
		this.RazaoSocial = RazaoSocial;
		this.CNPJ = CNPJ;
		this.Endereco = Endereco;
		this.Numero = Numero;
		this.CEP= CEP;
	}
	
	public ClienteCadastro(){
		
	}
	
	
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String RazaoSocial) {
		this.RazaoSocial = RazaoSocial;
	}
	public String getCnjp() {
		return CNPJ;
	}
	public void setCnjp(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String Numero) {
		this.Numero = Numero;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	
	
	

}

	

