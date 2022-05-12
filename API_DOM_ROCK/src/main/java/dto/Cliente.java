package dto;

public class Cliente {
	
	public String Cliente;
	public String CNPJ;
	public String Setor;
	
	public Cliente (String Cliente, String CNPJ, String Setor) {
		
		this.Cliente = Cliente;
		this.CNPJ = CNPJ;
		this.Setor = Setor;
		
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getSetor() {
		return Setor;
	}

	public void setSetor(String setor) {
		Setor = setor;
	}
	
	

}
