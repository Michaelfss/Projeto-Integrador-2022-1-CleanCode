package API;

public class CadastroCliente {
	protected String nome;
    protected String razaoSocial;
	protected String cnjp;
	protected String endereco;
	protected String numero;
	
	public CadastroCliente(String nome, String razaoSocial, String cnpj, String endereco, String numero) {
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.cnjp = cnpj;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
