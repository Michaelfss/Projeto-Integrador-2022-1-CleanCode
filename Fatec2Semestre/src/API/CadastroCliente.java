package API;

public class CadastroCliente {
    private String razaoSocial;
	private String cnjp;
	private String cep;
	private String endereco;
	private String numero;
	
	public CadastroCliente(String razaoSocial, String cnpj, String cep, String endereco, String numero) {
		this.razaoSocial = razaoSocial;
		this.cnjp = cnpj;
		this.cep = cep;
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

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
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
