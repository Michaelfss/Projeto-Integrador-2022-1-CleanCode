package dto;

public class Funcionalidade {
	
	String PaineisDeSolucoes;
	String GeradorDeRelatorios;
	String BuscarNLP;
	String DataLakeGenerator;
	
	public Funcionalidade (String PaineisDeSolucoes, String GeradorDeRelatorios, String BuscarNLP, String DataLakeGenerator) {
		
		this.PaineisDeSolucoes = PaineisDeSolucoes;
		this.GeradorDeRelatorios = GeradorDeRelatorios;
		this.BuscarNLP = BuscarNLP;
		this.DataLakeGenerator = DataLakeGenerator;
	}

	public String getPaineisDeSolucoes() {
		return PaineisDeSolucoes;
	}

	public void setPaineisDeSolucoes(String paineisDeSolucoes) {
		PaineisDeSolucoes = paineisDeSolucoes;
	}

	public String getGeradorDeRelatorios() {
		return GeradorDeRelatorios;
	}

	public void setGeradorDeRelatorios(String geradorDeRelatorios) {
		GeradorDeRelatorios = geradorDeRelatorios;
	}

	public String getBuscarNLP() {
		return BuscarNLP;
	}

	public void setBuscarNLP(String buscarNLP) {
		BuscarNLP = buscarNLP;
	}

	public String getDataLakeGenerator() {
		return DataLakeGenerator;
	}

	public void setDataLakeGenerator(String dataLakeGenerator) {
		DataLakeGenerator = dataLakeGenerator;
	}

}
