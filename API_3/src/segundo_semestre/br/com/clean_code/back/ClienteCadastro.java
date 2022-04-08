package segundo_semestre.br.com.clean_code.back;

public class ClienteCadastro {
	
	protected String razaoSocial;
	protected String cnjp;
	protected String endereco;
	protected String numero;
	
	public ClienteCadastro(String razaoSocial, String cnpj, String endereco, String numero) {
		this.razaoSocial = razaoSocial;
		this.cnjp = cnpj;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnjp() {
		return cnjp;
	}
	public void setCnjp(String cnjp) {
		this.cnjp = cnjp;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
