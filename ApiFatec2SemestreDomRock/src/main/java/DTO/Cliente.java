package DTO;

public class Cliente {
	
	private String cliente;
	private String cnpj;
	private String razaoSocial;
	private String setor;
	private String entregaveisMinimos;
	private String entregaveisPossiveis;
	private String objetivoNegocio;

	
	public Cliente(String cliente, String cnpj, String razaoSocial, String setor, String entregaveisMinimos,
		String entregaveisPossiveis, String objetivoNegocio) {
		this.cliente = cliente;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.setor = setor;
		this.entregaveisMinimos = entregaveisMinimos;
		this.entregaveisPossiveis = entregaveisPossiveis;
		this.objetivoNegocio = objetivoNegocio;
	}


	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getEntregaveisMinimos() {
		return entregaveisMinimos;
	}
	public void setEntregaveisMinimos(String entregaveisMinimos) {
		this.entregaveisMinimos = entregaveisMinimos;
	}

	public String getEntregaveisPossiveis() {
		return entregaveisPossiveis;
	}
	public void setEntregaveisPossiveis(String entregaveisPossiveis) {
		this.entregaveisPossiveis = entregaveisPossiveis;
	}

	public String getObjetivoNegocio() {
		return objetivoNegocio;
	}
	public void setObjetivoNegocio(String objetivoNegocio) {
		this.objetivoNegocio = objetivoNegocio;
	}
}
