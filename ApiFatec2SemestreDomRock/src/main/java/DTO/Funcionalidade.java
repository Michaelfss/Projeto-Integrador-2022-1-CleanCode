package DTO;

public class Funcionalidade {
	
	private String paineisSolucoes;
	private String geradorRelatorios;
	private String buscarNLP;
	private String dataLakeGenerator;

	
	public Funcionalidade(String paineisSolucoes, String geradorRelatorios, String buscarNLP,
			String dataLakeGenerator) {
		this.paineisSolucoes = paineisSolucoes;
		this.geradorRelatorios = geradorRelatorios;
		this.buscarNLP = buscarNLP;
		this.dataLakeGenerator = dataLakeGenerator;
	}


	public String getPaineisSolucoes() {
		return paineisSolucoes;
	}
	public void setPaineisSolucoes(String paineisSolucoes) {
		this.paineisSolucoes = paineisSolucoes;
	}

	public String getGeradorRelatorios() {
		return geradorRelatorios;
	}
	public void setGeradorRelatorios(String geradorRelatorios) {
		this.geradorRelatorios = geradorRelatorios;
	}

	public String getBuscarNLP() {
		return buscarNLP;
	}
	public void setBuscarNLP(String buscarNLP) {
		this.buscarNLP = buscarNLP;
	}

	public String getDataLakeGenerator() {
		return dataLakeGenerator;
	}
	public void setDataLakeGenerator(String dataLakeGenerator) {
		this.dataLakeGenerator = dataLakeGenerator;
	}
}
